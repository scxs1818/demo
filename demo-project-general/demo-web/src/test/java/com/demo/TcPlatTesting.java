package com.demo;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.bean.plat.TcPlatAcctInfo;
import com.demo.bean.plat.TcPlatInfo;
import com.demo.bean.plat.TcPlatRequestParams;
import com.demo.bean.plat.TcPlatVirtualAcct;
import com.demo.bean.plat.TcPlatVirtualAcctBal;
import com.demo.commons.utils.CommonResult;
import com.demo.service.RegisterPlatService;
import com.google.gson.Gson;

@RunWith(SpringRunner.class)
@SpringBootTest
//@WebAppConfiguration
public class TcPlatTesting {
	@Autowired
	RegisterPlatService registerPlatService;
	
	@Test
	public void testTcPlat(){
		
		Gson gson =new Gson();
		TcPlatRequestParams param = new TcPlatRequestParams();
		TcPlatInfo tcPlatInfo = new TcPlatInfo();
		tcPlatInfo.setPay_merch_id("20001000000001");
		tcPlatInfo.setPlat_name("测试平台1");
		tcPlatInfo.setLegal_person("张三");
		tcPlatInfo.setStatus("N");
		tcPlatInfo.setAdress("上海市");
		tcPlatInfo.setPayment_type("0");
		tcPlatInfo.setAllow_user("1");
		param.setTcPlatInfo(tcPlatInfo);
		
		List<TcPlatAcctInfo>tcPlatAcctInfo = new ArrayList<TcPlatAcctInfo>();
		TcPlatAcctInfo tcPlatAcctInfo1 = new TcPlatAcctInfo();
		tcPlatAcctInfo1.setAcct_type("0");
		tcPlatAcctInfo1.setAcct_no("12345");
		tcPlatAcctInfo1.setAcct_ccy("RMB");
		tcPlatAcctInfo1.setAcct_status("F");
		TcPlatAcctInfo tcPlatAcctInfo2 = new TcPlatAcctInfo();
		tcPlatAcctInfo2.setAcct_type("1");
		tcPlatAcctInfo2.setAcct_no("1234555");
		tcPlatAcctInfo2.setAcct_ccy("RMB");
		tcPlatAcctInfo2.setAcct_status("F");
		tcPlatAcctInfo.add(tcPlatAcctInfo1);
		tcPlatAcctInfo.add(tcPlatAcctInfo2);
		param.setTcPlatAcctInfo(tcPlatAcctInfo);
		
		
		TcPlatVirtualAcct tcPlatVirtualAcct = new TcPlatVirtualAcct();
		tcPlatVirtualAcct.setAcct_ccy("RMB");
		tcPlatVirtualAcct.setPay_merch_id("123");
		tcPlatVirtualAcct.setVir_acct_type("SS");
		tcPlatVirtualAcct.setVir_acct_name("虚拟账户");
		tcPlatVirtualAcct.setVir_acct_sort("1");
		tcPlatVirtualAcct.setAcct_status("N");
		tcPlatVirtualAcct.setIs_in("Y");
		tcPlatVirtualAcct.setIs_out("Y");
		param.setTcPlatVirtualAcct(tcPlatVirtualAcct);
		
		TcPlatVirtualAcctBal tcPlatVirtualAcctBal =new TcPlatVirtualAcctBal();
		tcPlatVirtualAcctBal.setVir_acct_type("s");
		tcPlatVirtualAcctBal.setActural_bal(new BigDecimal(12000));
		tcPlatVirtualAcctBal.setUsable_bal(new BigDecimal(12));
		tcPlatVirtualAcctBal.setFreeze_bal(new BigDecimal(120));
		param.setTcPlatVirtualAcctBal(tcPlatVirtualAcctBal);
		String params =gson.toJson(param);
		System.out.println("params"+params);
		CommonResult result = registerPlatService.register(params);
		System.out.println("result=="+result);
	}
	
}
