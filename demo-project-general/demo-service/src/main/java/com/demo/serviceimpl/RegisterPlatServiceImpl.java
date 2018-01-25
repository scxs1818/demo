package com.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.demo.bean.plat.TcPlatAcctInfo;
import com.demo.bean.plat.TcPlatInfo;
import com.demo.bean.plat.TcPlatRequestParams;
import com.demo.bean.plat.TcPlatVirtualAcct;
import com.demo.bean.plat.TcPlatVirtualAcctBal;
import com.demo.common.service.SequenceService;
import com.demo.commons.utils.CommonResult;
import com.demo.commons.utils.CommonUtils;
import com.demo.mapper.base.TcPlatInfoMapper;
import com.demo.service.RegisterPlatService;
import com.demo.service.TcPlatAcctInfoService;
import com.demo.service.TcPlatInfoService;
import com.demo.service.TcPlatVirtualAcctBalService;
import com.demo.service.TcPlatVirtualAcctService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


@Service
public class RegisterPlatServiceImpl implements RegisterPlatService {
	private static int PLAT_ID_SEQ_NO_LENGTH = 4;
	@Autowired
	SequenceService sequenceService;
	@Autowired
	TcPlatInfoMapper tcPlatInfoMapper;
	@Autowired
	TcPlatInfoService tcPlatInfoService;
	@Autowired
	TcPlatAcctInfoService tcPlatAcctInfoService;
	//TcPlatAcctInfoMapper tcPlatAcctInfoMapper;
	@Autowired
	//TcPlatVirtualAcctMapper tcPlatVirtualAcctMapper;
	TcPlatVirtualAcctService tcPlatVirtualAcctService;
	@Autowired
	TcPlatVirtualAcctBalService tcPlatVirtualAcctBalService;
	//TcPlatVirtualAcctBalMapper tcPlatVirtualAcctBalMapper;
	/**
	 * 测试方法
	 */
	@Override
	public List<TcPlatInfo> queryAll() {
		// TODO Auto-generated method stub
		List<TcPlatInfo> list = tcPlatInfoMapper.selectAll();
		return list;
	}

	/**
	 * 注册平台实现方法 入参校验今后需处理
	 * 
	 * @param  params
	 * @return CommonResult 注册返回结果
	 * @author Administrator
	 */
	@Override
	public CommonResult register(String params) {
		CommonResult result = new CommonResult();
		try {
			// TODO Auto-generated method stub
			if (StringUtils.isEmpty(params)) {
				commonResult(result, "未获取平台注册信息");
				return result;
			}
			/**
			 * 平台注册表判断
			 */
			// mapper.select();
			Gson gson = new GsonBuilder().create();
			TcPlatRequestParams tcPlatRequestParams = gson.fromJson(params, TcPlatRequestParams.class);
			if(tcPlatRequestParams==null){
				commonResult(result, "未获取平台注册信息");
				return result;
			}
			TcPlatInfo tcPlatInfo = tcPlatRequestParams.getTcPlatInfo();
			// 必输校验
			// TODO 该部分需要优化
			if (tcPlatInfo == null) {
				commonResult(result, "未获取平台注册信息");
				return result;
			}
			if (StringUtils.isEmpty(tcPlatInfo.getPay_merch_id())) {
				commonResult(result, "pay_merch_id is null");
				return result;
			}
			// 校验支付商户编码是否存在
			TcPlatInfo tc = new TcPlatInfo();
			tc.setPay_merch_id(tcPlatInfo.getPay_merch_id());
			List<TcPlatInfo> tcPlatInfoList = tcPlatInfoMapper.select(tc);
			if (tcPlatInfoList != null && tcPlatInfoList.size() > 0) {
				commonResult(result, "当前平台已经注册");
				return result;
			}

			if (StringUtils.isEmpty(tcPlatInfo.getPlat_name())) {
				commonResult(result, "plat_name is null");
				return result;
			}
			if (StringUtils.isEmpty(tcPlatInfo.getLegal_person())) {
				commonResult(result, "legal_person is null");
				return result;
			}
			if (StringUtils.isEmpty(tcPlatInfo.getStatus())) {
				commonResult(result, "status is null");
				return result;
			}
			if (StringUtils.isEmpty(tcPlatInfo.getPayment_type())) {
				commonResult(result, "payment_type is null");
				return result;
			}
			// 获取最新平台编码
			String currentPlatSeq = sequenceService.getSquenceByName("PLAT_ID_SEQ_NO");
			if (StringUtils.isEmpty(currentPlatSeq)) {
				commonResult(result, "平台编码 获取失败");
				return result;
			}
			String platId ="3"+CommonUtils.getSeq(PLAT_ID_SEQ_NO_LENGTH, currentPlatSeq);
			tcPlatInfo.setPlat_id(platId);
			// 保存商户平台信息
		//	tcPlatInfoMapper.insert(tcPlatInfo);
			tcPlatInfoService.insert(tcPlatInfo);
			//更新序列表
			sequenceService.update("PLAT_ID_SEQ_NO");
			//登记平台资金清算专户和平台结算账户
			List<TcPlatAcctInfo> tcPlatAcctInfoList = tcPlatRequestParams.getTcPlatAcctInfo();
			if(tcPlatAcctInfoList!=null&&tcPlatAcctInfoList.size()>0){
				for(TcPlatAcctInfo tcPlatAcctInfo:tcPlatAcctInfoList){
					//必输字段校验
					if (StringUtils.isEmpty(tcPlatAcctInfo.getAcct_type())) {
						commonResult(result, "acct_type is null");
						return result;
					}
					if (StringUtils.isEmpty(tcPlatAcctInfo.getAcct_no())) {
						commonResult(result, "acct_no is null");
						return result;
					}
					if (StringUtils.isEmpty(tcPlatAcctInfo.getAcct_ccy())) {
						commonResult(result, "acct_ccy is null");
						return result;
					}
					if (StringUtils.isEmpty(tcPlatAcctInfo.getAcct_status())) {
						commonResult(result, "acct_status is null");
						return result;
					}
					tcPlatAcctInfo.setPlat_id(platId);
			//		tcPlatAcctInfoMapper.insert(tcPlatAcctInfo);
					tcPlatAcctInfoService.insert(tcPlatAcctInfo);
				}
			}else{
				commonResult(result, "获取平台资金清算专户/平台结算账户信息失败");
				return result;
			}
			//注册平台虚拟账户
			TcPlatVirtualAcct tcPlatVirtualAcct = tcPlatRequestParams.getTcPlatVirtualAcct();
			if(tcPlatVirtualAcct==null){
				commonResult(result, "获取注册平台虚拟账户失败");
				return result;
			}
			//字段校验
			if (StringUtils.isEmpty(tcPlatVirtualAcct.getPay_merch_id())) {
				commonResult(result, "pay_merch_id is null");
				return result;
			}
			if (StringUtils.isEmpty(tcPlatVirtualAcct.getVir_acct_type())) {
				commonResult(result, "vir_acct_type is null");
				return result;
			}
			if (StringUtils.isEmpty(tcPlatVirtualAcct.getVir_acct_sort())) {
				commonResult(result, "vir_acct_sort is null");
				return result;
			}
			if (StringUtils.isEmpty(tcPlatVirtualAcct.getVir_acct_name())) {
				commonResult(result, "vir_acct_name is null");
				return result;
			}
			if (StringUtils.isEmpty(tcPlatVirtualAcct.getAcct_ccy())) {
				commonResult(result, "acct_ccy is null");
				return result;
			}
			if (StringUtils.isEmpty(tcPlatVirtualAcct.getAcct_status())) {
				commonResult(result, "acct_status is null");
				return result;
			}
			if (StringUtils.isEmpty(tcPlatVirtualAcct.getIs_in())) {
				commonResult(result, "is_in is null");
				return result;
			}
			if (StringUtils.isEmpty(tcPlatVirtualAcct.getIs_out())) {
				commonResult(result, "is_out is null");
				return result;
			}
			String virPlatId = platId+"001";
			
			tcPlatVirtualAcct.setPlat_id(platId);
			tcPlatVirtualAcct.setVir_acct_id(virPlatId);
			//保存平台虚拟账户信息
			//tcPlatVirtualAcctMapper.insert(tcPlatVirtualAcct);
			tcPlatVirtualAcctService.insert(tcPlatVirtualAcct);
			//平台虚拟账户余额信息表
			TcPlatVirtualAcctBal tcPlatVirtualAcctBal=tcPlatRequestParams.getTcPlatVirtualAcctBal();
			if(tcPlatVirtualAcctBal==null){
				commonResult(result, "获取平台虚拟账户余额信息失败");
				return result;
			}
			//必输字段校验
			if (StringUtils.isEmpty(tcPlatVirtualAcctBal.getVir_acct_type())) {
				commonResult(result, "vir_acct_type is null");
				return result;
			}
			if (StringUtils.isEmpty(tcPlatVirtualAcctBal.getActural_bal())) {
				commonResult(result, "actural_bal is null");
				return result;
			}
			if (StringUtils.isEmpty(tcPlatVirtualAcctBal.getUsable_bal())) {
				commonResult(result, "usable_bal is null");
				return result;
			}
			if (StringUtils.isEmpty(tcPlatVirtualAcctBal.getFreeze_bal())) {
				commonResult(result, "freeze_bal is null");
				return result;
			}
			tcPlatVirtualAcctBal.setPlat_id(platId);
			tcPlatVirtualAcctBal.setVir_acct_id(virPlatId);
			//tcPlatVirtualAcctBalMapper.insert(tcPlatVirtualAcctBal);
			tcPlatVirtualAcctBalService.insert(tcPlatVirtualAcctBal);
			result.setDate(null);
			result.setMsg("注册商户信息成功");
			result.setStatus("S");
		} catch (Exception e) {
			commonResult(result, e.getMessage());
		}

		return result;
	}

	public void commonResult(CommonResult result, String msg) {
		result.setDate(null);
		result.setMsg(msg);
		result.setStatus("F");
	}
}
