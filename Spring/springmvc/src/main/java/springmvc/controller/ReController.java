package springmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
	@RequestMapping("/one")
	public String one() {
		System.out.println("this is one handler");
		//using Redirect Prefix
		
		
//		using Redirect View
//		RedirectView redirectView = new RedirectView();
//		redirectView.setUrl("https://www.google.com/");
//		return redirectView;
		return "redirect:/enjoy";
	}
	
	@RequestMapping("/enjoy")
	public String two() {
		System.out.println("this is two handler[enjoy]");
		return "contact";
	}
}
