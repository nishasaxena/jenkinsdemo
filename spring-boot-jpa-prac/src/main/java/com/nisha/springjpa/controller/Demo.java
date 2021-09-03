package com.nisha.springjpa.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Demo {

	private static Logger logger = LoggerFactory.getLogger(Demo.class);

	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		logger.info("in hello User");
		return "Hello User";
	}

	@RequestMapping("/")
	public String index() {
		logger.info("in index");
		return "home.jsp";
	}

}
