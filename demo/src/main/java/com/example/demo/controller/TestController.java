package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;

@RestController
public class TestController {
    @RequestMapping(value="hello")
	public String hello() {
    	//这是测试的
		return "hello,this is springboot";
	}
    @RequestMapping(value="/getperson")
    public Person getperson() {
    	Person p = new Person();
    	p.setName("张三");
    	p.setPwd("123");
    	return p;
    }
}
