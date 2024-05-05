package com.studentdemo.StudentManagementSystem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface studentrepo extends JpaRepository<studentdetails,String>{
    
}
