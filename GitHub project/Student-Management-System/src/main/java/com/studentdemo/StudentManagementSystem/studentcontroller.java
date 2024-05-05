package com.studentdemo.StudentManagementSystem;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/studentdetails")
public class studentcontroller {
    studentservice service;

    public studentcontroller(studentservice service) {
        this.service = service;
    }
    @GetMapping("{id}")
    public String getstudentdetails(@PathVariable("id")String id){
        return service.getstudent(id);
    }
    
    @PostMapping
    public String createstudentdetails(@RequestBody studentdetails details){
        service.createstudent(details);
        return "created successfully";
    }
    @PutMapping
    public String updatestudentdetails(@RequestBody studentdetails details){
        service.updatestudent(details);
        return "updated successfully";
    }
     @DeleteMapping("{id}")
    public String deletestudentdetails(@PathVariable("id")String id){
        service.deletestudent(null);
        return "deleted successfully";
    }

}



