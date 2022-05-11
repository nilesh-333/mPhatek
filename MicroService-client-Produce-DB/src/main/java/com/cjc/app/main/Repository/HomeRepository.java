package com.cjc.app.main.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.main.model.Student;
@Repository
public interface HomeRepository extends CrudRepository<Student, Integer>
{

}
