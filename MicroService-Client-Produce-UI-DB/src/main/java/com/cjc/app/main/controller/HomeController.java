package com.cjc.app.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.main.model.Employee;
import com.cjc.app.main.service.HomeService;
@RestController
public class HomeController {

	@Autowired
	HomeService hs;
	
	@RequestMapping("/getProduceData")
	public Employee displayData()
	{
		Employee s=new Employee();
		s.setPhoneNo(8208087690d);
		s.setFirstname("Nilesh");
		s.setLastname("Gitte");
		s.setEmailaddress("Nilesh.gitte@mPhatek.com");
		
		return s;
	}
	
	@RequestMapping("/displayalldata")
	public List<Employee> displayAlldata()
	{
		List<Employee>list=(List<Employee>) hs.displayAllData();
		return list;
	}

	@RequestMapping(value = "/insertdata", method = RequestMethod.POST)
	public Employee insertdata(@RequestBody Employee s)
	{
		System.out.println("-----Inserted Data-----");
		System.out.println("First Name- "+s.getFirstname());
		System.out.println("Phone Number "+s.getPhoneNo());
		System.out.println("Email Address- "+s.getEmailaddress());
		System.out.println("Uname- "+s.getLastname());
		System.out.println("-----------------------");
		
		Employee stu=hs.save(s);
		return stu;
	}

	@RequestMapping(value="/update/{phoneno}",method=RequestMethod.PUT) 
	public Employee updatedata(@RequestBody Employee s,@PathVariable("Phone Number")double phoneno) 
	{ 
		 System.out.println("-------Updated data------");	
		 
		 System.out.println("Phone Number- "+s.getPhoneNo());
		 System.out.println("Name- "+s.getFirstname());
		 System.out.println("Address- "+s.getEmailaddress());
		 System.out.println("Uname- "+s.getLastname());
		
		 System.out.println("-----------------------");

		 Employee stu=hs.save(s);
		 
		 return stu; 
	}
	@RequestMapping(value="/deleteData/{phoneno}",method=RequestMethod.DELETE)
	public String deleteData(@RequestBody Employee s,@PathVariable("Phone Number")double phoneno)
	{
		  System.out.println("Data with Phoneno- "+s.getPhoneNo()+ "is deleted successfully!");//pri key
		  
		  hs.delete(s);
		  return "Deleted Successfully!";
	    
	}
}
