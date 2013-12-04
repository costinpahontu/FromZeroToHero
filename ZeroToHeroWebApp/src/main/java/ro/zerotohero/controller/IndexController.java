package ro.zerotohero.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ro.zerotohero.model.RollEntity;

	@Controller
	@RequestMapping("/")


public class IndexController {


		 @RequestMapping(method=RequestMethod.GET)
		 public String index(ModelMap model){
				
			 RollEntity roll1=new RollEntity();
			 roll1.setId("1");
			 roll1.setName("mihai");
			 
			 RollEntity roll2=new RollEntity();
			 roll2.setId("2");
			 roll2.setName("popa");
			
			 ArrayList<RollEntity> rollList= new ArrayList<RollEntity>();
			 rollList.add(roll1);
			 rollList.add(roll2);
			 
			 
			model.addAttribute("message","Application Index");
			model.addAttribute("rollList",rollList);
			
			return "index";
		}	
	
	
	
}
