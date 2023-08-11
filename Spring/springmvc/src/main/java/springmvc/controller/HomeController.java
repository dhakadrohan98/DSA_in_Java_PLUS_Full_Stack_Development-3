package springmvc.controller;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	
	// public String home(Model model) {}=> Handler method
	//returing name of view
	@RequestMapping(path="/home", method = RequestMethod.GET)
	public String home(Model model) {
		// URL=> http://localhost:8080/springmvc/first/home
		model.addAttribute("name", "Sigma");
		model.addAttribute("id", 234522);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Vandana");
		friends.add("Roshni");
		friends.add("Rohan");
		friends.add("Shubham");
		
		model.addAttribute("frnd",friends);
		System.out.println("this is home url");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		// URL=> http://localhost:8080/springmvc/first/about
		System.out.println("this is about controller");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		// URL=> http://localhost:8080/springmvc/first/help
		System.out.println("this is help controller");
		
		//creating model & view object
		ModelAndView modelAndView = new ModelAndView();		
		
		//setting the data
		modelAndView.addObject("name", "Uttam maveli");
		modelAndView.addObject("rollno", 986335);
		
		//Setting current Date & Time
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		//marks
		List<Integer> list = new ArrayList<Integer>();
		list.add(12567);
		list.add(1324);
		list.add(1543);
		list.add(1232);
		list.add(125);
		list.add(909009);
		modelAndView.addObject("marks",list);
		
		//Setting view name
		modelAndView.setViewName("help");
		return modelAndView;
	}
	
}
