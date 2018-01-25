package com.demo.bean.plat;

import java.math.BigDecimal;

public class TcPlatVirtualAcct {
	private String vir_acct_id;	//平台虚拟账户编号                                   
	private String plat_id;	//平台编号                                               
	private String pay_merch_id;	//支付平台编号                                         
	private String vir_acct_type;	//账户类型                                               
	private String vir_acct_sort;	//账户归属类别 1：会员 2：平台 3：交易平台  
	private String vir_acct_name;	//虚拟账户名称                                         
	private String acct_ccy;	//币种                                                     
	private String acct_status;	//账户状态 n：正常 f：冻结c：注销               
	private String is_in;	//是否允许转入y：是 n:否                            
	private String is_out;	//是否允许转出y：是 n:否                            
	private String is_total_limit;	//是否有总额限制y：是 n:否                         
	private BigDecimal total_limit;	//总额限制                                               
	private String is_balance_limit;	//是否留备付金y：是 n:否                            
	private String balance_type;	//备付金限额方式                                      
	private BigDecimal balance_value;	//备付金限额数值                                      
	private String open_date;	//开户日期                                               
	private String open_user;	//开户操作员                                            
	private String cancel_date;	//销户日期                                               
	private String cancel_user;	//销户操作员                                            
	private String update_date;	//状态更新日期                                         
	private String source_user;	//状态更新操作员                                      
	private String effect_date;	//有效期                                                  
	private String plat_name;	//平台名称  
	public String getVir_acct_id() {
		return vir_acct_id;
	}
	public void setVir_acct_id(String vir_acct_id) {
		this.vir_acct_id = vir_acct_id;
	}
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
	public String getVir_acct_type() {
		return vir_acct_type;
	}
	public void setVir_acct_type(String vir_acct_type) {
		this.vir_acct_type = vir_acct_type;
	}
	public String getVir_acct_sort() {
		return vir_acct_sort;
	}
	public void setVir_acct_sort(String vir_acct_sort) {
		this.vir_acct_sort = vir_acct_sort;
	}
	public String getVir_acct_name() {
		return vir_acct_name;
	}
	public void setVir_acct_name(String vir_acct_name) {
		this.vir_acct_name = vir_acct_name;
	}
	public String getAcct_ccy() {
		return acct_ccy;
	}
	public void setAcct_ccy(String acct_ccy) {
		this.acct_ccy = acct_ccy;
	}
	public String getAcct_status() {
		return acct_status;
	}
	public void setAcct_status(String acct_status) {
		this.acct_status = acct_status;
	}
	public String getIs_in() {
		return is_in;
	}
	public void setIs_in(String is_in) {
		this.is_in = is_in;
	}
	public String getIs_out() {
		return is_out;
	}
	public void setIs_out(String is_out) {
		this.is_out = is_out;
	}
	public String getIs_total_limit() {
		return is_total_limit;
	}
	public void setIs_total_limit(String is_total_limit) {
		this.is_total_limit = is_total_limit;
	}
	public BigDecimal getTotal_limit() {
		return total_limit;
	}
	public void setTotal_limit(BigDecimal total_limit) {
		this.total_limit = total_limit;
	}
	public String getIs_balance_limit() {
		return is_balance_limit;
	}
	public void setIs_balance_limit(String is_balance_limit) {
		this.is_balance_limit = is_balance_limit;
	}
	public String getBalance_type() {
		return balance_type;
	}
	public void setBalance_type(String balance_type) {
		this.balance_type = balance_type;
	}
	public BigDecimal getBalance_value() {
		return balance_value;
	}
	public void setBalance_value(BigDecimal balance_value) {
		this.balance_value = balance_value;
	}
	public String getOpen_date() {
		return open_date;
	}
	public void setOpen_date(String open_date) {
		this.open_date = open_date;
	}
	public String getOpen_user() {
		return open_user;
	}
	public void setOpen_user(String open_user) {
		this.open_user = open_user;
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
	public String getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}
	public String getSource_user() {
		return source_user;
	}
	public void setSource_user(String source_user) {
		this.source_user = source_user;
	}
	public String getEffect_date() {
		return effect_date;
	}
	public void setEffect_date(String effect_date) {
		this.effect_date = effect_date;
	}
	public String getPlat_name() {
		return plat_name;
	}
	public void setPlat_name(String plat_name) {
		this.plat_name = plat_name;
	}
	
	
}
