package com.demo.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.demo.bean.plat.TcPlatAcctInfo;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Testing {
	public static void main(String[] args) {
		Sub sub =new Sub();
		sub.setSex("m");
		SubB sub1 =new SubB();
		sub1.setAge("10");
		sub1.setName("zhangsan");
		SubB sub2 =new SubB();
		sub2.setAge("10");
		sub2.setName("zhang");
		List<SubB> subList =new ArrayList<SubB>();
		subList.add(sub1);
		subList.add(sub2);
		sub.setSub(subList);
		Gson gson = new Gson();
	String json = gson.toJson(sub);
	System.out.println(json);
	List<SubB> list =gson.fromJson(json,  
            new TypeToken<List<SubB>>() {  
            }.getType()); 
		System.out.println(list);
	}
}
class Sub{
	private String sex;
	private List<SubB> sub;
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public List<SubB> getSub() {
		return sub;
	}
	public void setSub(List<SubB> sub) {
		this.sub = sub;
	}
	@Override
	public String toString() {
		return "Sub [sex=" + sex + ", sub=" + sub + "]";
	}
	
}
class SubB{
	private String name;
	private String age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
}