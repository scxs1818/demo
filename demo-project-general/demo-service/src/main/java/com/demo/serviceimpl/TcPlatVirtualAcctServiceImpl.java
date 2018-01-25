package com.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.demo.bean.plat.TcPlatVirtualAcct;
import com.demo.mapper.base.TcPlatVirtualAcctMapper;
import com.demo.service.TcPlatVirtualAcctService;
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
@Service
public class TcPlatVirtualAcctServiceImpl implements TcPlatVirtualAcctService {
	@Autowired
	TcPlatVirtualAcctMapper tcPlatVirtualAcctMapper;
	@Override
	public int insert(TcPlatVirtualAcct tcPlatVirtualAcct) {
		// TODO Auto-generated method stub
		return tcPlatVirtualAcctMapper.insert(tcPlatVirtualAcct);
	}

}
