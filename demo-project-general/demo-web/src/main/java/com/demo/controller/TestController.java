package com.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.*;

import com.demo.bean.ClassInfo;
import com.demo.bean.User;
import com.demo.bean.utils.Sequence;
import com.demo.common.service.SequenceService;
import com.demo.service.UserServer;

@RestController
public class TestController {
	@Resource
	UserServer service;
	@Resource
	SequenceService seqService;
	
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
	@RequestMapping("/condition")
	public List<User> selectByConditon(String name) {
		System.out.println("name="+name);
		return service.selectByConditon(name);
	}
	@RequestMapping("/update")
	public int updateSeq(String name){
		return seqService.update(name);
	}
	@RequestMapping("testHashMap")
	public List<User> testMap(@RequestParam Map<String,Object> map){
		List<User> list = new ArrayList<User>();
		String name="";
		int age=0;
		if(map.containsKey("name")){
			name =(String)map.get("name");
		}
		if(map.containsKey("age")){
			age =Integer.parseInt(map.get("age").toString());
		}
		User user = new User();
		user.setUserId(3);
		user.setName(name);
		user.setAge(age);
		list.add(user);
		return list;
	}
}
