package com.demo.serviceimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;

import com.demo.bean.ClassInfo;
import com.demo.bean.User;
import com.demo.mapper.base.BaseClassInfoMapper;
import com.demo.mapper.base.BaseUserMapper;
import com.demo.mapper.UserMapper;
import com.demo.service.UserServer;
@Transactional
@Service
public class UserServiceImpl implements UserServer{
	@Resource
	private UserMapper userMapper;
	@Resource
	private BaseUserMapper baseMapper;
	@Resource
	private BaseClassInfoMapper classMapper;
	@Override
	public List<User> queryAll() {
		return userMapper.queryAll();
	}
	
	@Override
	public User queryUserByName(String name) {
		// TODO Auto-generated method stub
		
		return userMapper.queryUserByName(name);
	}
	/**
	 * 通用mapper测试
	 */
	public List<User> selectAll(){
		return baseMapper.selectAll();
	}
	/**
	 * 分页测试
	 */
	public List<User> selectAll(int pageNum,int pageSize){
		PageHelper.startPage(pageNum,pageSize);
		return baseMapper.selectAll();
	}

	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		
		return userMapper.insertUser(user);
	}
	/**
	 * 测试关联查询
	 */
	@Override
	public List<User> getUserClass(String classId) {
		
		return userMapper.getUserClass(classId);
	}

	@Override
	public int inserClassInfo(ClassInfo classIndfo) {
		
		return classMapper.insert(classIndfo);
	}

	@Override
	public List<User> selectByConditon(String name) {
		User user = new User();
		user.setName(name);
		List<User> list=	baseMapper.select(user);
		return list;
	}
	
	
}
