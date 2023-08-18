package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "LearnCodeWith Rohan");
		m.addAttribute("Desc", "Home for programmer");
	}
	
	//contact form method
	@RequestMapping("/contact")
	public String showForm(Model m) {
		return "contact";
	}
	
	//Handle form method
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) {
		System.out.println(user);
		
		if(user.getName().isBlank()) {
			return "redirect:/contac";
		}
		this.userService.createUser(user);
		return "success";
	}
}


/*
 * //Handle form method
 * 
 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
 * String handleForm(
 * 
 * @RequestParam(name ="email") String email,
 * 
 * @RequestParam("name") String name,
 * 
 * @RequestParam("password") String password, Model model ) {
 * 
 * User user = new User(); user.setEmail(email); user.setName(name);
 * user.setPassword(password); System.out.println(user);
 * 
 * model.addAttribute("user", user);
 * 
 * //processing the input data (coming from HTML form) //
 * model.addAttribute("email",email+" custom data"); //
 * model.addAttribute("name", name+" data manipulated"); //
 * model.addAttribute("password", password + " show password"); return
 * "success"; }
 */
