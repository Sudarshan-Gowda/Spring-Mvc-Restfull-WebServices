package com.star.sud.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BasicController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String basicPage() {

		return "basic/home";

	}

}
