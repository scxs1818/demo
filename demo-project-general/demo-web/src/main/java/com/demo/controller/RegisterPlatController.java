package com.demo.controller;

import java.util.Map;

import javax.annotation.Resource;


import org.springframework.web.bind.annotation.RestController;

import com.demo.commons.utils.CommonResult;
import com.demo.service.RegisterPlatService;

@RestController
public class RegisterPlatController {
	@Resource
	RegisterPlatService service;
	
	public CommonResult registerPlat(String params){
		return service.register(params);
	}
}
