package springmvc_mybatis_base.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import springmvc_mybatis_base.biz.DbTestService;

public class DbTestController implements Controller {
	public DbTestService serv;

	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		System.out.println("DbTestController");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DbTest");
		
		serv.test();
		return mv;
	}
	
	public void setServ(DbTestService serv) {
		this.serv = serv;
	}

}
