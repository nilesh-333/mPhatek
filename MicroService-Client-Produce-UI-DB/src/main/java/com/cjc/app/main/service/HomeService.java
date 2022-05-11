package com.cjc.app.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cjc.app.main.model.Employee;

@Service
public interface HomeService {

	public Iterable<Employee> displayAllData();

	public Employee save(Employee s);

	public void delete(Employee s);

}
