package com.cjc.app.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cjc.app.main.Repository.HomeRepository;
import com.cjc.app.main.model.Student;
import com.cjc.app.main.service.HomeService;

public class HomeServiceImpl implements HomeService
{

	@Autowired
	HomeRepository hr;
	
	@Override
	public Iterable<Student> displayAllData() 
	{
		return hr.findAll();
	}

	@Override
	public Student save(Student s)
	{
		
		return hr.save(s);
	}

	@Override
	public void delete(Student s)
	{
		
		hr.delete(s);
	}

}
