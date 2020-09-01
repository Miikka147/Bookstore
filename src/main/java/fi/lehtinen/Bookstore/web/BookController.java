package fi.lehtinen.Bookstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class BookController {

	@RequestMapping("/index")
	@ResponseBody
	public String IndexPage() {		
		
		return "This is the index page";
}
	



		
	}