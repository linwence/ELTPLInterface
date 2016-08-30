package com.el.action.distribution;

import java.io.IOException;
import java.io.InputStream;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.el.connect.DBContextHolder;
import com.el.service.distribution.IDistributionService;
import com.el.util.CalculateSignHelp;
import com.el.util.PropertiesUtil;
import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;

public class DistributionAction extends ActionSupport {

	public static String SECRET_KEY = "";//用于加密的key
	
	private static Logger logger = Logger.getLogger(DistributionAction.class);
	private TreeMap<String, Object> data;
	@Autowired
	private IDistributionService distributionService;
	
	public TreeMap<String, Object> getData() {
		return data;
	}
	public void setData(TreeMap<String, Object> data) {
		this.data = data;
	}

	
	public String test() {
		data = new TreeMap<String, Object>();
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		try {
			DBContextHolder.setDBType(DBContextHolder.DATA_SOURCE_INTERFACE);
			count1 = distributionService.test_interfaceDB();
			DBContextHolder.setDBType(DBContextHolder.DATA_SOURCE_ERP);
			count2 = distributionService.test_erpDB();
			DBContextHolder.setDBType(DBContextHolder.DATA_SOURCE_INTERFACE);
			count3 = distributionService.test_interfaceDB();
		} catch (Exception e) {
			e.printStackTrace();
			data.put("errno", "1");
			data.put("errmsg", e.getMessage());
		}
		//success
		data.put("errno", "0");
		data.put("count1", count1);
		data.put("count2", count2);
		data.put("count3", count3);
		return SUCCESS;
	}
	
	public String test2() {
		data = new TreeMap<String, Object>();
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		try {
			DBContextHolder.setDBType(DBContextHolder.DATA_SOURCE_ERP);
			count1 = distributionService.test_erpDB();
			DBContextHolder.setDBType(DBContextHolder.DATA_SOURCE_INTERFACE);
			count2 = distributionService.test_interfaceDB();
			DBContextHolder.setDBType(DBContextHolder.DATA_SOURCE_ERP);
			count3 = distributionService.test_erpDB();
		} catch (Exception e) {
			e.printStackTrace();
			data.put("errno", "1");
			data.put("errmsg", e.getMessage());
		}
		//success
		data.put("errno", "0");
		data.put("count1", count1);
		data.put("count2", count2);
		data.put("count3", count3);
		return SUCCESS;
	}
	
	/**
	 * 获取app的请求，进行解析
	 * @return
	 */
	public String processRequest() {
		HttpServletRequest request = ServletActionContext.getRequest();
		InputStream is= null;
		String contentStr="";
		PropertiesUtil properties = new PropertiesUtil("application.properties");
		SECRET_KEY = properties.getPropertyByKey("appsecretDistribute");
		try {
			//获得request的body数据，并转换为对象
			is = request.getInputStream();         
			contentStr= IOUtils.toString(is, "utf-8");
			logger.info("Request:"+contentStr.replaceAll("\\s+", " "));
			RequestParameter param = null;
			try{
				Gson gson = new Gson();
				param = gson.fromJson(contentStr, RequestParameter.class);
			}catch(Exception e){
				e.printStackTrace();
				data = GenerateMap_paramFormatError();
				return SUCCESS;
			}
			//设置使用的数据源
			DBContextHolder.setDBType(DBContextHolder.DATA_SOURCE_ERP);
			//检查基本参数是否完整
			if(param==null){
				data = GenerateMap_paramFormatError();
			} else if(param.getCmd()==null || param.getCmd().trim().equals("")){
				data = GenerateBodyMap_paramMissError(param, "cmd");
			} else if(param.getTimestamp()==0){
				data = GenerateBodyMap_paramMissError(param, "timestamp");
			} else if(param.getSource()==null || param.getSource().trim().equals("")){
				data = GenerateBodyMap_paramMissError(param, "source");
			} else if(param.getSign()==null || param.getSign().trim().equals("")){
				data = GenerateBodyMap_paramMissError(param, "sign");
			} 
			else if(isSignError(param)){
				data = GenerateBodyMap_paramMissError(param, "加密不正确");
			}
			//根据不同cmd值，执行不同的业务模块
			else if(param.getCmd().equals("distribution.get")){
				//待抢单据查询
				data = GenerateMap(param, distributionService.getOrder_todo(param.getBody()));
			} else if(param.getCmd().equals("distribution.getdone")){
				//已抢单据查询
				data = GenerateMap(param, distributionService.getOrder_done(param.getBody()));
			} else if(param.getCmd().equals("distribution.grab")){
				//配送抢单
				if(param.getBody().getE1psn()==null || param.getBody().getE1psn().trim().equals("")){
					data = GenerateBodyMap_paramMissError(param, "e1psn");
				} else if(param.getBody().getDeliveryman()==null || param.getBody().getDeliveryman().getUrrf()==null || param.getBody().getDeliveryman().getUrrf().trim().equals("")){
					data = GenerateBodyMap_paramMissError(param, "deliveryman.urrf");
				} else {
					data = GenerateMap(param, distributionService.grabOrder(param.getBody()));
				}
				String e1psn = param.getBody().getE1psn();
				distributionService.callAppOrderChangeStatus("distribution", e1psn);
			} else if(param.getCmd().equals("distribution.reduce")){
				//配送扣减 ERP 库存
				//由于存在bug：调用存储过程时，FE4LN001表中的数据尚未能全部插入（猜测是由于hibernate事务未完全提交导致），因此将存储过程的调用独立出一个方法，以保证之前的事务操作能够提交。
				TreeMap<String, Object> bodyMap = distributionService.reduceInventory(param.getBody());//计算批次数据，并存入配送单批次表FE4LN001
				if((Integer)bodyMap.get("errno") == 0){//上一步操作执行成功
					bodyMap = distributionService.reduceInventory_callPro(param.getBody());//调用存储过程，完成出库操作
				}
				data = GenerateMap(param, bodyMap);
			} else if(param.getCmd().equals("distribution.complete")){
				//配送签收
				data = GenerateMap(param, distributionService.distribute_complete(param.getBody()));
				
				String e1psn = param.getBody().getE1psn();
				distributionService.callAppOrderChangeStatus("complete", e1psn);
			} else if(param.getCmd().equals("distribution.reject")){
				//配送拒收
				data = GenerateMap(param, distributionService.distribute_reject(param.getBody()));
				
				String e1psn = param.getBody().getE1psn();
				distributionService.callAppOrderChangeStatus("reject", e1psn);
			}
		} catch (IOException e) {
			e.printStackTrace();     
		}
		logger.info("Reponse:"+JSONObject.fromObject(data));
		return SUCCESS;
	}
	
	/**
	 * 生成需要返回的完整Map数据：参数格式错误
	 * @return
	 */
	private TreeMap<String, Object> GenerateMap_paramFormatError(){
		TreeMap<String, Object> bodyMap = new TreeMap<String, Object>();
		bodyMap.put("errno", 100);
		bodyMap.put("error", "failure");
		bodyMap.put("data", "参数格式错误");
		TreeMap<String, Object> map = new TreeMap<String, Object>();
		map.put("cmd", "");
		map.put("timestamp", System.currentTimeMillis());
		map.put("source", "");
		map.put("body", bodyMap);
		//计算密钥（md5），并存入map中
		map.put("secret", SECRET_KEY);
		String sign = CalculateSignHelp.CalculateSign(map);
		map.put("sign", sign);
		map.remove("secret");
		return map;
	}
	
	/**
	 * 生成需要返回的Map数据中的body内容：缺少参数
	 * @return
	 */
	private TreeMap<String, Object> GenerateBodyMap_paramMissError(RequestParameter originalParam, String errorParamName){
		TreeMap<String, Object> bodyMap = new TreeMap<String, Object>();
		bodyMap.put("errno", 101);
		bodyMap.put("error", "failure");
		bodyMap.put("data", "缺少参数："+errorParamName);
		return GenerateMap(originalParam, bodyMap);
	}

	/**
	 * 生成需要返回的完整Map数据
	 * @param originalParam 请求的原始参数
	 * @param bodyMap 需要放入body对象中的数据
	 * @return
	 */
	private TreeMap<String, Object> GenerateMap(RequestParameter originalParam, TreeMap<String, Object> bodyMap){
		TreeMap<String, Object> map = new TreeMap<String, Object>();
		map.put("cmd", "resp."+originalParam.getCmd());
		map.put("timestamp", System.currentTimeMillis());
		map.put("source", originalParam.getSource());
		map.put("body", bodyMap);
		//计算密钥（md5），并存入map中
		map.put("secret", SECRET_KEY);
		String sign = CalculateSignHelp.CalculateSign(map);
		map.put("sign", sign);
		map.remove("secret");
		return map;
	}
	
	/**
	 * 验证加密是否正确
	 * @param param 请求的原始参数
	 * @return true:验证失败 false:验证成功
	 */
	private boolean isSignError(RequestParameter param){
		String signedStr = param.getSignedStr(SECRET_KEY);
		if(signedStr!=null && signedStr.equals(param.getSign()))
			return false;
		else
			return true;
	}
	
}

