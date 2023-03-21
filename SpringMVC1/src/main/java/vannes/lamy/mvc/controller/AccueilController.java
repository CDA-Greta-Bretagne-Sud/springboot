package vannes.lamy.mvc.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccueilController {

	@GetMapping("/")
	public String welcomePage(Model model) {
		model.addAttribute("date", new Date().toString());
	    model.addAttribute("var1", "comment ca va?");

		// Return the view
		return "bienvenu";
	}
}
