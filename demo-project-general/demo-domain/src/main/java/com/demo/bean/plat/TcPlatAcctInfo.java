package com.demo.bean.plat;

public class TcPlatAcctInfo {
	private Integer acct_id;	//账户编号                                                                     
	private String plat_id;	//平台编号                                                                     
	private String acct_type;	//账户类型 0：结算账户1：交易平台存管专户2：银行内部账户  
	private String acct_no;	//账户                                                                           
	private String acct_name;	//账户名称                                                                     
	private String is_this_bank;	//是否本行账户                                                               
	private String acct_br_no;	//开户行号                                                                     
	private String acct_br_name;	//开户行名称                                                                  
	private String acct_ccy;	//币种                                                                           
	private String update_date;	//更新日期                                                                     
	private String update_user;	//更新操作员                                                                  
	private String acct_status;	//账户状态n：正常f：冻结c：注销                                       
	private String acct_category;	//账户类别
	public Integer getAcct_id() {
		return acct_id;
	}
	public void setAcct_id(Integer acct_id) {
		this.acct_id = acct_id;
	}
	public String getPlat_id() {
		return plat_id;
	}
	public void setPlat_id(String plat_id) {
		this.plat_id = plat_id;
	}
	public String getAcct_type() {
		return acct_type;
	}
	public void setAcct_type(String acct_type) {
		this.acct_type = acct_type;
	}
	public String getAcct_no() {
		return acct_no;
	}
	public void setAcct_no(String acct_no) {
		this.acct_no = acct_no;
	}
	public String getAcct_name() {
		return acct_name;
	}
	public void setAcct_name(String acct_name) {
		this.acct_name = acct_name;
	}
	public String getIs_this_bank() {
		return is_this_bank;
	}
	public void setIs_this_bank(String is_this_bank) {
		this.is_this_bank = is_this_bank;
	}
	public String getAcct_br_no() {
		return acct_br_no;
	}
	public void setAcct_br_no(String acct_br_no) {
		this.acct_br_no = acct_br_no;
	}
	public String getAcct_br_name() {
		return acct_br_name;
	}
	public void setAcct_br_name(String acct_br_name) {
		this.acct_br_name = acct_br_name;
	}
	public String getAcct_ccy() {
		return acct_ccy;
	}
	public void setAcct_ccy(String acct_ccy) {
		this.acct_ccy = acct_ccy;
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
	public String getAcct_status() {
		return acct_status;
	}
	public void setAcct_status(String acct_status) {
		this.acct_status = acct_status;
	}
	public String getAcct_category() {
		return acct_category;
	}
	public void setAcct_category(String acct_category) {
		this.acct_category = acct_category;
	}
}
