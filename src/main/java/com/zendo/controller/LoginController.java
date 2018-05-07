package com.zendo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController extends BaseController{
	
	@RequestMapping("/main.do")
	public ModelAndView doIdex() throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;
	}
	@RequestMapping("/")
	public ModelAndView doLogin() throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;
	}
}
