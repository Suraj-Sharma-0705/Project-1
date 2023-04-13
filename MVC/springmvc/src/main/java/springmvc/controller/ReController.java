package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("this is one handler");
		RedirectView redirectview=new RedirectView();
		redirectview.setUrl("enjoy");
		return redirectview;
	}
	
	@RequestMapping("enjoy")
	public String two() {
		System.out.println("This is two handler[enjoy]");
		return"contact";
	}
}
