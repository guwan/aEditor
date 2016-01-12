package top.knos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/demos/*")
public class ViewsController {

	
	@RequestMapping(value="/editor", method=RequestMethod.GET)
	public void editor(Model model) {
		model.addAttribute("foo", "bar");
		model.addAttribute("fruit", "apple");
	}

	@RequestMapping(value="/editor", method=RequestMethod.POST)
	public void editorSubmit(Model model) {
		model.addAttribute("foo", "bar");
		model.addAttribute("fruit", "apple");
	}

}
