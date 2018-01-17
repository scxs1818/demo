package com.demo.mapper;

import java.util.List;

import com.demo.bean.User;

public interface UserMapper {
	List<User> queryAll();
	User queryUserByName(String name);
	int insertUser(User user);
	//关联查询
	List<User> getUserClass(String classId);
}
