package org.kaav.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		ModelAndView model = new ModelAndView("HelloPage");
        model.addObject("welcomemessage", "Hi user,welcome");
        
		return model;
	}

}
