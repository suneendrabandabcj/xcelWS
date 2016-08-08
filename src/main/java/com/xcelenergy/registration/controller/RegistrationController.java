package com.xcelenergy.registration.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xcelenergy.registration.model.Customer;
import com.xcelenergy.registration.service.CustomerService;

@Controller
public class RegistrationController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		Customer customerDetails = new Customer();
		model.put("customerDetails", customerDetails);

		return "customerRegistration";

	}

	@RequestMapping(value = "/processRegistraion", method = RequestMethod.POST)
	public ModelAndView processRegistraion(@ModelAttribute("customerDetails") Customer customer) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/beans/CustomerBeans.xml");
		CustomerService customerService = (CustomerService) appContext.getBean("customerService");
		System.out.println(customer.getFirstName());
		
		ModelAndView model;
		
		try {
			customerService.registerCustomer(customer);
			model = new ModelAndView("RegistrationSuccess");
		} catch (Exception e) {
			e.printStackTrace();
			model = new ModelAndView("RegistrationFailure");
			model.addObject("error", e);
		}
		

		return model;
	}

}
