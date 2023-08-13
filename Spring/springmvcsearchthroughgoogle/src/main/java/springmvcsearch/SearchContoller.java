package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchContoller {
	
	@RequestMapping("user/{userId}/{userName}")
	public String getUserDetail(@PathVariable("userId") int userId, 
								@PathVariable("userName") String userName) 
	{
		System.out.println("User ID: "+ userId);
		System.out.println("User Name: " + userName);
		return "home";
	}
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("Going to home view...");
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		
		String url = "https://www.google.com/search?q=" + query;
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		return redirectView;
	}
}
