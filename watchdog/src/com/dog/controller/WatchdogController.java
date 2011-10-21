package com.dog.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import com.dog.dao.IWatchdogDao;


public class WatchdogController  extends MultiActionController {
	
	//private final Log logger = LogFactory.getLog(getClass());
	private static org.apache.log4j.Logger Log = Logger.getLogger(WatchdogController.class);	
	protected ApplicationContext springAppContext = null;
	
/*	public ModelAndView testaddCustomer(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			
			System.out.println("--------->ADD");
			
			return new ModelAndView("CustomerPage", "msg","add() method");
				
		}*/
		
		public ModelAndView dodeleteWatchdog(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			System.out.println("--------->DELETE");
				
			return new ModelAndView("CustomerPage", "msg","delete() method");
					
		}
		
		public ModelAndView doupdateWatchdog(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			System.out.println("--------->Update");
				
			return new ModelAndView("CustomerPage", "msg","update() method");
					
		}
		
		public ModelAndView dolistWatchdog(HttpServletRequest request,
			HttpServletResponse response) throws Exception {			
			System.out.println("--------->List");
			Log.debug("--->dolistWatchdog");
			//return new ModelAndView("CustomerPage", "msg","list() method");			
			
			springAppContext = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());			
			ModelAndView mav = new ModelAndView("paging");
			
			// get data
			//IWatchdogDao is interface
			Log.debug("--->IWatchdogDoa get Data");
			IWatchdogDao dogDao = (IWatchdogDao) springAppContext.getBean("IWatchdogDao");  
			List searchResults = dogDao.findByName("");
			
			// initialize PagedListHolder with our list, set current page defaulted to 0, and pass it to the view
			PagedListHolder pagedListHolder = new PagedListHolder(searchResults);
			int page = ServletRequestUtils.getIntParameter(request, "p", 0);
			
			Log.debug("--->initialize PagedListHolder with our list");
			pagedListHolder.setPage(page);
			int pageSize = 10;
			pagedListHolder.setPageSize(pageSize);
			mav.addObject("pagedListHolder", pagedListHolder);
			
			Log.debug("--->Return view");
			return mav;						
		}

}
