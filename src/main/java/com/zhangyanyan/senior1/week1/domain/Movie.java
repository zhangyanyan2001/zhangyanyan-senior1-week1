package com.zhangyanyan.senior1.week1.domain;


public class Movie {

	private Integer id;
	
	private String name;
	
	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	private String dao;
	
	private String price;
	
	private String uptime;
	
	private Integer longtime;
	
	private String type;
	
	private String year;
	
	private String tell;
	
	private String stear;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDao() {
		return dao;
	}

	public void setDao(String dao) {
		this.dao = dao;
	}

	

	public String getUptime() {
		return uptime;
	}

	public void setUptime(String uptime) {
		this.uptime = uptime;
	}

	public Integer getLongtime() {
		return longtime;
	}

	public void setLongtime(Integer longtime) {
		this.longtime = longtime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getTell() {
		return tell;
	}

	public void setTell(String tell) {
		this.tell = tell;
	}

	public String getStear() {
		return stear;
	}

	public void setStear(String stear) {
		this.stear = stear;
	}
	
	
}
