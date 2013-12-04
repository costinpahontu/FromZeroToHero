package ro.zerotohero.controller.employee;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ro.zerotohero.model.EmployeeEntity;

	@Controller
	@RequestMapping("/employee")


public class EmployeeController{


		 @RequestMapping(method=RequestMethod.GET)
		 public String index(ModelMap model){
			 
			 EmployeeEntity employee1=new EmployeeEntity();
             employee1.setFirstName("pahontu");
             employee1.setLastName("costin");
             employee1.setEmail("andiaw@ada");
             employee1.setPassword("123");
             EmployeeEntity employee2=new EmployeeEntity();
             employee2.setFirstName("dawd");
             employee2.setLastName("costiafen");
             employee2.setEmail("aiaw@ada");
             employee2.setPassword("1234");
          
		
ArrayList<EmployeeEntity> employeelist=new ArrayList<EmployeeEntity>();
employeelist.add(employee1);
employeelist.add(employee2);
             
				
			model.addAttribute("message","employee Index");
			model.addAttribute("employeeList",employeelist);
			return "employee/index";
		}	
	
	
	
}
