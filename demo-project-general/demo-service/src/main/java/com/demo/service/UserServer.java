package com.demo.service;

import java.util.List;

import com.demo.bean.ClassInfo;
import com.demo.bean.User;

public interface UserServer {
	List<User> queryAll();
	User queryUserByName(String name);
	List<User> selectAll();
	List<User> selectByConditon(String name);
	int insertUser(User user);
	List<User> getUserClass(String classId);
	int inserClassInfo(ClassInfo classIndfo);
}
