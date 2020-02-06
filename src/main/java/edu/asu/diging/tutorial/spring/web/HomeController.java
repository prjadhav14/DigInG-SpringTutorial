package edu.asu.diging.tutorial.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.asu.diging.tutorial.spring.service.MoodService;

@Controller
public class HomeController {
	@Autowired
	private MoodService service;
	@RequestMapping(value = "/")
	public String home(ModelMap map) {
		map.addAttribute("mood",service.getCurrentMood());
	    return "index2";
	}
	@RequestMapping(path = "/{mood}",method=RequestMethod.POST)
	public String reason(@PathVariable String mood,ModelMap map) {
		map.addAttribute("reason",service.getDescription(mood));
	    return "index3";
	}
}
