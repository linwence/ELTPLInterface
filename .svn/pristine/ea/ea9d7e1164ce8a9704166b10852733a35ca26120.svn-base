package com.el.service.impl;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.sf.json.JSONObject;

import com.el.baidu.api.BaiduConfirm;
import com.el.baidu.api.BaiduConfirmSerializer;
import com.el.baidu.api.Cmd;
import com.el.baidu.api.CmdSerializer;
import com.el.dao.impl.F55wsd02DAO;
import com.el.entity.F55wsd02;
import com.el.service.IWaimaiStatusService;
import com.el.util.HttpRequestUtil;
import com.el.util.Md5;
import com.el.util.PropertiesUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Service("waimaiStatusServiceImpl")
@Scope("prototype")
public class WaimaiStatusServiceImpl implements IWaimaiStatusService {
	private static Logger logger = Logger
			.getLogger(WaimaiStatusServiceImpl.class);

	private F55wsd02DAO f55wsd02DAO;

	public F55wsd02DAO getF55wsd02DAO() {
		return f55wsd02DAO;
	}

	@Resource
	public void setF55wsd02DAO(F55wsd02DAO f55wsd02dao) {
		f55wsd02DAO = f55wsd02dao;
	}

	public WaimaiStatusServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<F55wsd02> queryF55wsd02ByTime() {
		// TODO Auto-generated method stub
		// IHE58HDRQD 要求送货日期，格式为YYYY-MM-DD
		// IHTXT2 要求送货时间到，格式为HH:mm:ss
		String hql = "from F55wsd02 a  where (to_number(sysdate-to_date(trim(a.ihe58hdrqd)||' '||trim(a.ihtxt2),'yyyy-mm-dd hh24:mi:ss'))*24)>4 "
				+ "and (trim(a.ihe58hus23)='1003')"// or
													// trim(a.IHE58HUS23)='1006'
													// or
													// trim(a.IHE58HUS23)='1010')"
				+ " and nvl(trim(ihe58huf06),2)=2 "
				+ " and to_date(ihe58hboct,'yyyy-mm-dd')>to_date('2016-02-01','yyyy-mm-dd')";
		// + "AND TRIM(ihe58eboid)=14501439486881";
		List<F55wsd02> lstF55wsd02 = f55wsd02DAO.queryForList(hql, null);
		return lstF55wsd02;
	}

	@Override
	@Transactional
	public void doFinish() {
		// TODO Auto-generated method stub
		System.out.println("开始执行外卖完成接口...........");
		logger.info("开始执行外卖完成接口...........");

		List<F55wsd02> lstF55wsd02 = queryF55wsd02ByTime();
		if (lstF55wsd02 == null || lstF55wsd02.size() == 0) {
			return;
		}
		for (F55wsd02 f55wsd02 : lstF55wsd02) {
			try {
				String e58hus23 = f55wsd02.getIhe58hus23().trim();
				if (e58hus23 == null || e58hus23.isEmpty()) {
					continue;
				}
				String orderid = f55wsd02.getIhe58eboid().trim();
				boolean flag = false;
				if ("1003".equals(e58hus23)) {
					flag = doBaiduFinish(orderid);
				} else if ("1006".equals(orderid)) {
					doElemeFinish(orderid);
				} else if ("1010".equals(orderid)) {
					doMeituanFinish(orderid);
				}

				if (flag) {
					String hql = "update F55wsd02 set Ihe58huf06='3' where id.ihukid="
							+ f55wsd02.getId().getIhukid();
					f55wsd02DAO.update(hql, null);
				}
			} catch (Exception ex) {

				logger.error("调用完成接口失败:" + ex.getMessage(), ex);
				System.out.println("调用完成接口失败:" + ex.getMessage());
			}

		}
		System.out.println("结束执行外卖完成接口...........");
		logger.info("结束执行外卖完成接口...........");

	}

	@Override
	public boolean doBaiduFinish(String orderid) {
		// TODO Auto-generated method stub
		int errno = 0;
		String error = "";
		try {
			PropertiesUtil properties = new PropertiesUtil(
					"application.properties");
			// 准备body数据
			String secret = properties.getPropertyByKey("baidusecret");
			String strSource = properties.getPropertyByKey("baidusource");
			String url = properties.getPropertyByKey("baiduurl");
			String command = "order.complete";
			BaiduConfirm baiduConfirm = new BaiduConfirm();
			baiduConfirm.setOrder_id(orderid);
			String requestJson = genBaiduRequestJson(command, strSource,
					secret, baiduConfirm);
			JSONObject jsonObj = HttpRequestUtil
					.httpBaiduPost(url, requestJson);
			JSONObject bodyJsonObj = jsonObj.getJSONObject("body");
			errno = bodyJsonObj.getInt("errno");
			error = bodyJsonObj.getString("error");

		} catch (Exception ex) {
			ex.printStackTrace();
			errno = 1;
			error = ex.getMessage();

		}

		if (errno != 0) {
			logger.error("error:百度外卖,调用订单完成接口失败,订单ID=" + orderid + ";errno="
					+ errno + ";errormsg=" + error);
			return false;
		}
		return true;

	}

	String genBaiduRequestJson(String command, String strSource, String secret,
			BaiduConfirm baiduConfirm) {

		// 准备CMD签名计算数据
		Cmd cmd = new Cmd();
		cmd.setCmd(command);
		cmd.setSource(Integer.parseInt(strSource));
		cmd.setSecret(secret);
		cmd.setTicket(UUID.randomUUID().toString().toUpperCase());
		cmd.setTimestamp((int) (System.currentTimeMillis() / 1000));
		cmd.setVersion(2);
		cmd.setBody(baiduConfirm);
		cmd.setSign(null);

		Gson gson = new GsonBuilder()
				.registerTypeAdapter(Cmd.class, new CmdSerializer())
				.registerTypeAdapter(BaiduConfirm.class,
						new BaiduConfirmSerializer()).disableHtmlEscaping()
				.create();
		String signJson = gson.toJson(cmd);
		// 对所有/进行转义
		signJson = signJson.replace("/", "\\/");
		// 中文字符转为unicode
		signJson = Md5.chinaToUnicode(signJson);
		System.out.println(signJson);
		String sign = Md5.getMD5(signJson);

		// 准备生成请求数据，此处注意secret不参与传递，故设置为null
		cmd.setSign(sign);
		cmd.setSecret(null);
		String requestJson = gson.toJson(cmd);
		// 对所有/进行转义
		requestJson = requestJson.replace("/", "\\/");
		// 中文字符转为unicode
		requestJson = Md5.chinaToUnicode(requestJson);

		System.out.println(requestJson);
		return requestJson;
	}

	@Override
	public void doElemeFinish(String orderid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doMeituanFinish(String orderid) {
		// TODO Auto-generated method stub

	}

}
