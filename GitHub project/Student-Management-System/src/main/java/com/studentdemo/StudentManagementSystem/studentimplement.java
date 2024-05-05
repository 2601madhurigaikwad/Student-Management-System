package com.studentdemo.StudentManagementSystem;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class studentimplement implements studentservice {
    studentrepo repo;

    public studentimplement(studentrepo repo) {
        this.repo = repo;
    }

    @Override
    public String createstudent(studentdetails details) {
        // TODO Auto-generated method stub
        repo.save(details);
        return "create successfully";
        //throw new UnsupportedOperationException("Unimplemented method 'createstudent'");
    }

    @Override
    public String updatestudent(studentdetails details) {
        // TODO Auto-generated method stub
        repo.save(details);
        return "updated successfully";
        //throw new UnsupportedOperationException("Unimplemented method 'updatestudent'");
    }

    @Override
    public String getstudent(String id) {
        // TODO Auto-generated method stub
        repo.findById(id);
        return "successfully";
        //throw new UnsupportedOperationException("Unimplemented method 'getstudent'");
    }

    @Override
    public String deletestudent(String id) {
        // TODO Auto-generated method stub
        repo.deleteById(id);
        return "deleted successfully";
        //throw new UnsupportedOperationException("Unimplemented method 'deletestudent'");
    }

    @Override
    public List<studentdetails> getallstudentdetails() {
        // TODO Auto-generated method stub
        return repo.findAll();
        //throw new UnsupportedOperationException("Unimplemented method 'getallstudentdetails'");
    }
}
