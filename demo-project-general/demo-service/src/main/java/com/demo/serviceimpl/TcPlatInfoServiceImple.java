package com.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.demo.bean.plat.TcPlatInfo;
import com.demo.mapper.base.TcPlatInfoMapper;
import com.demo.service.TcPlatInfoService;
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
@Service()
public class TcPlatInfoServiceImple implements TcPlatInfoService {
	@Autowired
	TcPlatInfoMapper tcPlatInfoMapper;
	@Override
	public int insert(TcPlatInfo tcPlatInfo) {
		return tcPlatInfoMapper.insert(tcPlatInfo);
	}

}
