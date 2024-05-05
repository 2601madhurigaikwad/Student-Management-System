package com.studentdemo.StudentManagementSystem;

import java.util.List;

public interface studentservice {
    public String createstudent(studentdetails details);
    public String updatestudent(studentdetails details);
    public String getstudent(String id);
    public String deletestudent(String id);
    public List<studentdetails> getallstudentdetails();
}



