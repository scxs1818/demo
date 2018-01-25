package com.demo.bean.utils;

public class Sequence {
	private String name;
	private int currentValue;
	private int increment;
	private String columnName;
	private String tableName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCurrentValue() {
		return currentValue;
	}
	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}
	public int getIncrement() {
		return increment;
	}
	public void setIncrement(int increment) {
		this.increment = increment;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	@Override
	public String toString() {
		return "Sequence [name=" + name + ", currentValue=" + currentValue + ", increment=" + increment
				+ ", columnName=" + columnName + ", tableName=" + tableName + "]";
	}
	
}
