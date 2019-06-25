package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Farmer;

@Controller
public class MainController {

	/**
	 * Simple Method with Old servlet way Learn @RequestMapping, How to get the
	 * parameter from Request and Redirect to UI Page
	 * http://localhost:8080/health?firstName=Sandeep
	 * @param req
	 * @return
	 */
	@RequestMapping("health")
	public String healthcheck(HttpServletRequest req) {
		HttpSession session = req.getSession();
		session.setAttribute("firstName", req.getParameter("firstName"));
		return "healthcheck";
	}

	/**
	 * This is sample method with ModelView and @RequestParam annotation
	 * http://localhost:8080/health?firstName=Sandeep
	 * @param name
	 * @return
	 */
	@RequestMapping("mvhealth")
	public ModelAndView modelViewHealthCheck(@RequestParam("firstName") String name) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("firstName", name);
		mv.setViewName("healthcheck");
		return mv;
	}

	/**
	 * This is sample use of Model pass the Object as parameter and then get thoes value using ModelAndView in JSP Page
	 * URL : http://localhost:8080/modelhealth?firstName=AAA&lastName=BBB&age=10
	 * @param farmer
	 * @return
	 */
	@RequestMapping("modelhealth")
	public ModelAndView modelUseHealthCheck(Farmer farmer) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("firstName", farmer.getFirstName());
		mv.addObject("lastName", farmer.getLastName());
		mv.addObject("age", farmer.getLastName());
		mv.setViewName("healthcheck");
		return mv;
	}	
}
