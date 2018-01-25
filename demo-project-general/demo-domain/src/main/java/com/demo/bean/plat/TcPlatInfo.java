package com.demo.bean.plat;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class TcPlatInfo {
	private String plat_id;      // 平台编号 
	private String pay_merch_id; // 支付商户编号
	private String plat_name;	// 平台名称                                 
	private String legal_person;	// 法人姓名                                     
	private String status;// 商户状态  n：正常  c：注销
	private String payment_type;// 结算类型 0-手动申请；1-日终自动结算  
	private String global_type;// 法人证件类型 
	private String global_id;	// 法人证件号码                 
	private String tel_no; 		// 联系电话
	private String email; 	// 企业邮箱       
	private String adress;	// 企业地址
	private String url;		// 企业网址
	private String create_date;		// 建立日期                        
	private String create_user;		// 建立操作员   
	private String update_date;		// 更新日期          
	private String update_user;// 更新操作员          
	private String cancel_date;// 注销日期  
	private String cancel_user;// 注销操作员           
	private String effect_date;// 有效期    
	private String source_type;// 来源                     
	private String remark;// 备注                                     
	private String plat_type;// 平台类别                    
	private String plat_level;// 平台等级                 
	private String allow_user;// 审批操作员         
	private String allow_date;// 审批时间                                        
	private String allow_status;//审批状态
	public String getPlat_id() {
		return plat_id;
	}
	public void setPlat_id(String plat_id) {
		this.plat_id = plat_id;
	}
	public String getPay_merch_id() {
		return pay_merch_id;
	}
	public void setPay_merch_id(String pay_merch_id) {
		this.pay_merch_id = pay_merch_id;
	}
	public String getPlat_name() {
		return plat_name;
	}
	public void setPlat_name(String plat_name) {
		this.plat_name = plat_name;
	}
	public String getLegal_person() {
		return legal_person;
	}
	public void setLegal_person(String legal_person) {
		this.legal_person = legal_person;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}
	public String getGlobal_type() {
		return global_type;
	}
	public void setGlobal_type(String global_type) {
		this.global_type = global_type;
	}
	public String getGlobal_id() {
		return global_id;
	}
	public void setGlobal_id(String global_id) {
		this.global_id = global_id;
	}
	public String getTel_no() {
		return tel_no;
	}
	public void setTel_no(String tel_no) {
		this.tel_no = tel_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
	public String getCreate_user() {
		return create_user;
	}
	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}
	public String getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}
	public String getUpdate_user() {
		return update_user;
	}
	public void setUpdate_user(String update_user) {
		this.update_user = update_user;
	}
	public String getCancel_date() {
		return cancel_date;
	}
	public void setCancel_date(String cancel_date) {
		this.cancel_date = cancel_date;
	}
	public String getCancel_user() {
		return cancel_user;
	}
	public void setCancel_user(String cancel_user) {
		this.cancel_user = cancel_user;
	}
	public String getEffect_date() {
		return effect_date;
	}
	public void setEffect_date(String effect_date) {
		this.effect_date = effect_date;
	}
	public String getSource_type() {
		return source_type;
	}
	public void setSource_type(String source_type) {
		this.source_type = source_type;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getPlat_type() {
		return plat_type;
	}
	public void setPlat_type(String plat_type) {
		this.plat_type = plat_type;
	}
	public String getPlat_level() {
		return plat_level;
	}
	public void setPlat_level(String plat_level) {
		this.plat_level = plat_level;
	}
	public String getAllow_user() {
		return allow_user;
	}
	public void setAllow_user(String allow_user) {
		this.allow_user = allow_user;
	}
	public String getAllow_date() {
		return allow_date;
	}
	public void setAllow_date(String allow_date) {
		this.allow_date = allow_date;
	}
	public String getAllow_status() {
		return allow_status;
	}
	public void setAllow_status(String allow_status) {
		this.allow_status = allow_status;
	}
	
	
	
}
