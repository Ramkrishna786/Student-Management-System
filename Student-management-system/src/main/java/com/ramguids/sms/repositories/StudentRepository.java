package com.ramguids.sms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramguids.sms.models.Student;


public interface StudentRepository extends JpaRepository<Student, Long>{

}
