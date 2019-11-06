package com.zhangyanyan.senior1.week1.vo;

import com.zhangyanyan.senior1.week1.domain.Movie;

public class MovieVo extends Movie{

	private String name;
	
	private String dao;
	
	private String year;
	
	private String  startuptime;
	private String  enduptime;
	
	private Integer  startprice;
	private Integer  endprice;
	
	private String  startlongtime;
	private String  endlongtime;
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
	
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getStartuptime() {
		return startuptime;
	}
	public void setStartuptime(String startuptime) {
		this.startuptime = startuptime;
	}
	public String getEnduptime() {
		return enduptime;
	}
	public void setEnduptime(String enduptime) {
		this.enduptime = enduptime;
	}
	public Integer getStartprice() {
		return startprice;
	}
	public void setStartprice(Integer startprice) {
		this.startprice = startprice;
	}
	public Integer getEndprice() {
		return endprice;
	}
	public void setEndprice(Integer endprice) {
		this.endprice = endprice;
	}
	public String getStartlongtime() {
		return startlongtime;
	}
	public void setStartlongtime(String startlongtime) {
		this.startlongtime = startlongtime;
	}
	public String getEndlongtime() {
		return endlongtime;
	}
	public void setEndlongtime(String endlongtime) {
		this.endlongtime = endlongtime;
	}
	
	
}
