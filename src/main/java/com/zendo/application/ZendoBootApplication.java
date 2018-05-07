package com.zendo.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@EnableTransactionManagement
@Controller
@ComponentScan("com.zendo.controller")
public class ZendoBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZendoBootApplication.class, args);
	}
	@RequestMapping("/hello")
    @ResponseBody
    String home() {
        return "Hello ,spring boot!";
    }
	
	@RequestMapping("/index.do")
	@ResponseBody
	public ModelAndView doIdex() throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/html/index.html");
		return mv;
	}
}
