package com.example.SpringProject.SpringProjectExample.bean;

import java.util.Date;

public class HelloWorldBean {
	
	private int id;
	private String name;
	private String Doj;
	
	public HelloWorldBean(int id, String name, String doj) {
		super();
		this.id = id;
		this.name = name;
		Doj = doj;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDoj() {
		return Doj;
	}
	public void setDoj(String doj) {
		Doj = doj;
	}
	@Override
	public String toString() {
		return "HelloWorldBean [id=" + id + ", name=" + name + ", Doj=" + Doj + "]";
	}
	

}
