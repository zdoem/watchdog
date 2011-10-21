package com.dog.controller;

import javax.servlet.ServletException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import com.dog.dao.MembersDog;
import com.dog.services.MebersDogImpl;

/*
 * date:2011-01-19
 * author: pradoem wongkraso
 * contact : go2doem@gmail.com,destar_@hotmail.com
 * description: this is class for Insert watch log into database by session user
 * 
 * */

@SuppressWarnings("deprecation")
public class AddWatchdogController extends SimpleFormController{
	
	@Override
	  protected ModelAndView onSubmit(Object command) //throws ServletException {
	  {  
		  ModelAndView modelAndView = null;
		  //Vector msg = new Vector();
		  // er.add("xxx...");
		  String msg = "";
		  try
		  {
			  MembersDog  request = (MembersDog)command;
			  if(request==null) {
				  modelAndView = new ModelAndView("msg_errors"); //Errors 
				  msg = "Object request is null.";
				  modelAndView.addObject("msg", msg);
				  return modelAndView;
			  }
			  
			  MebersDogImpl  regService = new  MebersDogImpl();
			 
			  //call Insert Database
			  int resultInt = regService.create(request);
			  
			  System.out.println("Controller -->> result:"+resultInt);
			  
			  if(resultInt == -1){
				  System.out.println("------->duplicate");
				  modelAndView = new ModelAndView("msg_errors"); //Errors 
				  msg = "Can't insert into database because duplicate field.";
				  modelAndView.addObject("msg", msg);	 
				  return modelAndView;
			  }
			  
			  if(resultInt > 0) {
				  modelAndView = new ModelAndView("msg_success");//Success
				  System.out.println("------>>Success.");
				  msg = "Success.";
				  modelAndView.addObject("msg", msg);	  
			  }
			  else {
				  modelAndView = new ModelAndView("msg_errors");//fail
				  System.out.println("------>>fail..");
				  msg = "fail.";
				  modelAndView.addObject("msg", msg);
			  } 
		  }
		  catch(Exception e){
			  e.fillInStackTrace();
			  modelAndView = new ModelAndView("msg_errors"); //Errors
			  msg = e.fillInStackTrace().toString();
			  modelAndView.addObject("msg", msg);  
		  } 
	    return modelAndView; 
	  }
}
