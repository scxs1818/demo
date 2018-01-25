package com.demo.bean.plat;

import java.math.BigDecimal;

public class TcPlatVirtualAcctBal {
	private String vir_acct_id;	//平台虚拟账户编号  
	private String plat_id;	//平台编号              
	private String vir_acct_type;	//虚拟账户类型        
	private BigDecimal actural_bal;	//当前余额              
	private BigDecimal usable_bal;	//可用余额              
	private BigDecimal freeze_bal;	//冻结金额              
	private BigDecimal charge_bal;	//充值金额   
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
	public String getVir_acct_type() {
		return vir_acct_type;
	}
	public void setVir_acct_type(String vir_acct_type) {
		this.vir_acct_type = vir_acct_type;
	}
	public BigDecimal getActural_bal() {
		return actural_bal;
	}
	public void setActural_bal(BigDecimal actural_bal) {
		this.actural_bal = actural_bal;
	}
	public BigDecimal getUsable_bal() {
		return usable_bal;
	}
	public void setUsable_bal(BigDecimal usable_bal) {
		this.usable_bal = usable_bal;
	}
	public BigDecimal getFreeze_bal() {
		return freeze_bal;
	}
	public void setFreeze_bal(BigDecimal freeze_bal) {
		this.freeze_bal = freeze_bal;
	}
	public BigDecimal getCharge_bal() {
		return charge_bal;
	}
	public void setCharge_bal(BigDecimal charge_bal) {
		this.charge_bal = charge_bal;
	}
	
}
