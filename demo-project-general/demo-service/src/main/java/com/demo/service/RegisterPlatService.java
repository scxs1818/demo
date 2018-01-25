package com.demo.service;

import java.util.List;
import java.util.Map;

import com.demo.bean.plat.TcPlatInfo;
import com.demo.commons.utils.CommonResult;

public interface RegisterPlatService {
	 List<TcPlatInfo> queryAll();
	 CommonResult register(String params);
}
