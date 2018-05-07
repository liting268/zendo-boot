package com.zendo.controller;

import java.sql.Timestamp;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.support.WebBindingInitializer;

import com.zendo.common.TimestampEditor;

public class BaseController implements WebBindingInitializer {

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Timestamp.class, new TimestampEditor());
	}

}
