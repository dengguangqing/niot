package cn.niot.controller;

import com.opensymphony.xwork2.ActionSupport;

import cn.niot.dao.*;
import cn.niot.rule.RuleFunction;
import cn.niot.service.*;
import cn.unitTest.RuleFuncTest;
public class RecoAction extends ActionSupport {
	/**
	 * @return
	 */
	private String iotID;
		
	public String getIotID() {
		return iotID;
	}

	public void setIotID(String iotID) {
		this.iotID = iotID;
	}
	
	private String Msg;    // ���һ������


	public String getMsg() {    // ���getter
		return Msg;
	}
	public String execute() {
		if (iotID.equals("123456")){
			Msg = "                   "+ iotID + " is ID type A";     // �߼�����
		} else{
			Msg = "                   "+ iotID + " is not ID type A";     // �߼�����
		}
		//138000100000000001.sh.beidou.cid.iot.cn
		//char [] IDstr = new char[]{'1','3','8','0','0','0','1','0','0','0','0','0','0','0','0','0','0','1','.','s','h','.','b','e','i',
			//	'd','o','u','.','c','i','d','.','i','o','t','.','c','n'};
		char[] IDstr = new char[]{'1', '1','0','0','0'};
		
		int [] index = new int[]{0,-1};
//		index[0] = 18;
//		index[1] = -1;
//		index[2] = -1;
//		index[3] = 3;
//		index[4] = 4;
		System.out.println(RuleFunction.GrainsSmartWMS(IDstr, IDstr.length, index, index.length));
		
		//NewIDstdCollisionDetect collisionDetecAlg = NewIDstdCollisionDetect.getCollisionDetectAlgorithm();
		//System.out.println(collisionDetecAlg.jsonStr2HashMap("{\"name\": \"123\",\"array\":\"abc\",\"address\":\"guangzhou\"}"));
		//System.out.println(collisionDetecAlg.generateIDString("{\"IDName\": \"XXXID\",\"Len\":\"3\",\"0\":\"2-5\",\"1\":\"A-E\",\"2\":\"h-x\"}"));
		//for (int i = 0; i < 100; i++){
		//	System.out.println(collisionDetecAlg.generateIDString("{\"IDName\": \"XXXID\",\"Len\":\"3\",\"0\":\"2-9,a-e\",\"1\":\"A-E,0-9\",\"2\":\"h-x,0-9\"}"));
		//}
		
		//RuleFuncTest.testTwoByteDecimalnt();
		
		return "sucess"; //Ԥ���峣��
	} 

}