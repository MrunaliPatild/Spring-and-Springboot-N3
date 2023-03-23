package org.tnsif.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//a controller contains the business logic of an application
@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("code to demonstrate on simple"+"web application");
		return"Home.jsp";
	}

}
