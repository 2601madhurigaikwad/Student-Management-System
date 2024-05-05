package com.studentdemo.StudentManagementSystem;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_Information")
public class studentdetails {
    @Id
    private String id;
    private String name;
    private String course;
    private String gender;
    private String address;
    private String mailid;
    private String phoneno;
    public studentdetails() {
    }
    public studentdetails(String id, String name, String course, String gender, String address, String mailid,
            String phoneno) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.gender = gender;
        this.address = address;
        this.mailid = mailid;
        this.phoneno = phoneno;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getMailid() {
        return mailid;
    }
    public void setMailid(String mailid) {
        this.mailid = mailid;
    }
    public String getPhoneno() {
        return phoneno;
    }
    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
}