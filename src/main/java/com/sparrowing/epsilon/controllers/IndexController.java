package com.sparrowing.epsilon.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sparrowing.epsilon.base.BaseController;

@Controller
public class IndexController extends BaseController {
	
	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}

}
