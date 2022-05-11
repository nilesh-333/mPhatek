package com.cjc.app.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.main.model.Student;
import com.cjc.app.main.service.HomeService;

@RestController
public class HomeController {

	
	@Autowired
	HomeService hs;
	
	@RequestMapping("/getProduceData")
	public Student displayData()
	{
		Student s=new Student();
		s.setRollno(121);
		s.setName("Nilesh");
		s.setUname("nnn");
		s.setPass("nnn");
		s.setAddr("Pune");
		
		return s;
	}
	
	@RequestMapping("/displayalldata")
	public List<Student> displayAlldata()
	{
		List<Student>list=(List<Student>) hs.displayAllData();
		return list;
	}

	@RequestMapping(value = "/insertdata", method = RequestMethod.POST)
	public Student insertdata(@RequestBody Student s)
	{
		System.out.println("-----Inserted Data-----");
		System.out.println("Name- "+s.getName());
		System.out.println("Rollno- "+s.getRollno());
		System.out.println("Address- "+s.getAddr());
		System.out.println("Uname- "+s.getUname());
		System.out.println("Password- "+s.getPass());
		System.out.println("-----------------------");
		
		Student stu=hs.save(s);
		return stu;
	}

	@RequestMapping(value="/update/{rollno}",method=RequestMethod.PUT) 
	public Student updatedata(@RequestBody Student s,@PathVariable("rollno")int rollno) 
	{ 
		 System.out.println("-------Updated data------");	
		 
		 System.out.println("Rollno- "+s.getRollno());
		 System.out.println("Name- "+s.getName());
		 System.out.println("Address- "+s.getAddr());
		 System.out.println("Uname- "+s.getUname());
		 System.out.println("Password- "+s.getPass());
		
		 System.out.println("-----------------------");

		 Student stu=hs.save(s);
		 
		 return stu; 
	}
	@RequestMapping(value="/deleteData/{rollno}",method=RequestMethod.DELETE)
	public String deleteData(@RequestBody Student s,@PathVariable("rollno")int rollno)
	{
		  System.out.println("Data with rollno- "+s.getRollno()+ "is deleted successfully!");//pri key
		  
		  hs.delete(s);
		  return "Deleted Successfully!";
	    
	}

}
