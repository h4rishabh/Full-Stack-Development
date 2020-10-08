package com.hrishabh.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.hrishabh.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
