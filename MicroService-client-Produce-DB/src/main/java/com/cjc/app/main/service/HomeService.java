package com.cjc.app.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cjc.app.main.model.Student;

@Service
public interface HomeService {

	public Iterable<Student> displayAllData();

	public Student save(Student s);

	public void delete(Student s);

}
