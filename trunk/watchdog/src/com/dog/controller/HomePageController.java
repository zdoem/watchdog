package com.dog.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HomePageController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws ServletException, IOException  {
		// TODO Auto-generated method stub
		ModelAndView modelAndView = new ModelAndView();
		//modelAndView.setViewName("home");
		modelAndView.setViewName("welcome");
		
		return modelAndView;
	}
	

}
