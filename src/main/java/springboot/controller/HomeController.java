package springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springboot.entity.User;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String homePage()
	{
		return "pages/index";
		
	}
	
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String loginPage(User user)
	{
		return "pages/login";
		
	}
	@RequestMapping(value = "/login-success",method = RequestMethod.POST)
	public String loginProcess(User user)
	{
		return "pages/index";
		
	}
	
	@RequestMapping(value = "/logout-success",method = RequestMethod.GET)
	public String logout()
	{
		return "redirect:/login";
		
	}
	


}
