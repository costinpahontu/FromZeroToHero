package ro.zerotohero.controller.admin;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ro.zerotohero.model.AdminEntity;
@Controller
@RequestMapping("/admin")
public class AdminController {



			 @RequestMapping(method=RequestMethod.GET)
			 public String index(ModelMap model){
				 
				 AdminEntity admin1=new AdminEntity();
	             admin1.setFirstName("pahontu");
	             admin1.setLastName("costin");
	             admin1.setEmail("andiaw@ada");
	             admin1.setPassword("123");
	             
				 AdminEntity admin2=new AdminEntity();
				 admin2.setFirstName("dawd");
	             admin2.setLastName("costiafen");
	             admin2.setEmail("aiaw@ada");
	             admin2.setPassword("1234");
			

			
	ArrayList<AdminEntity> adminlist=new ArrayList<AdminEntity>();
	adminlist.add(admin1);
	adminlist.add(admin2);
	             
				model.addAttribute("message","admin Index");
				
				model.addAttribute("adminList",adminlist);
				return "admin/index";
			}	
	
	

	
}
