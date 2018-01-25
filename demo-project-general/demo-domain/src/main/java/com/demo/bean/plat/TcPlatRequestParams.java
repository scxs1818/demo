package com.demo.bean.plat;

import java.util.List;

public class TcPlatRequestParams {
	private TcPlatInfo TcPlatInfo;
	private List<TcPlatAcctInfo>tcPlatAcctInfo;
	private TcPlatVirtualAcct tcPlatVirtualAcct;
	private TcPlatVirtualAcctBal tcPlatVirtualAcctBal;
	public TcPlatInfo getTcPlatInfo() {
		return TcPlatInfo;
	}
	public void setTcPlatInfo(TcPlatInfo tcPlatInfo) {
		TcPlatInfo = tcPlatInfo;
	}
	public List<TcPlatAcctInfo> getTcPlatAcctInfo() {
		return tcPlatAcctInfo;
	}
	public void setTcPlatAcctInfo(List<TcPlatAcctInfo> tcPlatAcctInfo) {
		this.tcPlatAcctInfo = tcPlatAcctInfo;
	}
	public TcPlatVirtualAcct getTcPlatVirtualAcct() {
		return tcPlatVirtualAcct;
	}
	public void setTcPlatVirtualAcct(TcPlatVirtualAcct tcPlatVirtualAcct) {
		this.tcPlatVirtualAcct = tcPlatVirtualAcct;
	}
	public TcPlatVirtualAcctBal getTcPlatVirtualAcctBal() {
		return tcPlatVirtualAcctBal;
	}
	public void setTcPlatVirtualAcctBal(TcPlatVirtualAcctBal tcPlatVirtualAcctBal) {
		this.tcPlatVirtualAcctBal = tcPlatVirtualAcctBal;
	}
	
}
