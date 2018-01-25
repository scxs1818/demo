package com.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.demo.bean.plat.TcPlatAcctInfo;
import com.demo.mapper.base.TcPlatAcctInfoMapper;
import com.demo.service.TcPlatAcctInfoService;
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
@Service
public class TcPlatAcctInfoServiceImpl implements TcPlatAcctInfoService{
	@Autowired
	TcPlatAcctInfoMapper tcPlatAcctInfoMapper;
	@Override
	public int insert(TcPlatAcctInfo tcPlatAcctInfo) {
		
		return tcPlatAcctInfoMapper.insert(tcPlatAcctInfo);
	}

}
