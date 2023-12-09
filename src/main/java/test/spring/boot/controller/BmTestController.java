package test.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import test.spring.boot.service.TestBoardService;

@Controller
public class BmTestController {

	@Autowired
	TestBoardService service;
	
	@RequestMapping("test")
	public @ResponseBody String bmTest() {
		return ""+service.testCount();
	}
}
