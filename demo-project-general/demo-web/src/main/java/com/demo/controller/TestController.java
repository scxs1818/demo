package com.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bean.ClassInfo;
import com.demo.bean.User;
import com.demo.service.UserServer;

@RestController
public class TestController {
	@Resource
	UserServer service;
	@RequestMapping("/abc")
	public String getMessage(){
		return "hello world";
	}
	@RequestMapping("/all")
	public List<User> findAll(){
		return service.queryAll();
	}
	@RequestMapping("/find")
	public User findOne(String name){
		return service.queryUserByName(name);
	}
	/**
	 * 分页测试
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<User> findAllUser(@RequestParam(defaultValue="1",required=false)int pageNo,@RequestParam(defaultValue="2",required=false) int pageSize){
		return service.selectAll();
	}
	@RequestMapping("/add")
	public int addUser(User user){
		System.out.println("user"+user);
		return service.insertUser(user);
	}
	@RequestMapping("/class")
	public List<User> getUserClass(String classId) {
		return service.getUserClass(classId);
	}
	
	@RequestMapping("/addclass")
	public int addClass(ClassInfo classInfo) {
		System.out.println("classInfo"+classInfo);
		return service.inserClassInfo(classInfo);
	}
}
