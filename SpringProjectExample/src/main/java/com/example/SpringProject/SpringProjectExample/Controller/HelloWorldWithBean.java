package com.example.SpringProject.SpringProjectExample.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringProject.SpringProjectExample.bean.HelloWorldBean;

@RestController
public class HelloWorldWithBean {
	@GetMapping("/data")
	public HelloWorldBean Data() {
		return new HelloWorldBean(1,"rajamani","2021-06-19");
	}

}
