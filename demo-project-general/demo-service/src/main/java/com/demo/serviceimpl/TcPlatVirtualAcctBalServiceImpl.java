package com.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.demo.bean.plat.TcPlatVirtualAcctBal;
import com.demo.mapper.base.TcPlatVirtualAcctBalMapper;
import com.demo.service.TcPlatVirtualAcctBalService;
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
@Service
public class TcPlatVirtualAcctBalServiceImpl implements TcPlatVirtualAcctBalService{
	@Autowired
	TcPlatVirtualAcctBalMapper tcPlatVirtualAcctBalMapper;
	@Override
	public int insert(TcPlatVirtualAcctBal tcPlatVirtualAcctBal) {
		// TODO Auto-generated method stub
		return tcPlatVirtualAcctBalMapper.insert(tcPlatVirtualAcctBal);
	}

}
