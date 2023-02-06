package com.School.example.service;

import com.School.example.entity.Staff;
import com.School.example.repository.StaffRepository;
import com.School.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StaffService {
    @Autowired
    private StaffRepository staffRepository;
    @Autowired
    private StudentRepository studentRepository;

    public String  save(Staff staff){
        staffRepository.saveAndFlush(staff);
        return "ok";
    }
    public  Staff listall(List<Staff> obj1) {
        List<Staff> obj2=new ArrayList<>();
        Staff obj3=null;
        for(Staff obj4:obj1){
            obj3=new Staff();
            staffRepository.save(obj4);
        }
        return obj3;
    }

    public List<Staff> getAll() {
        return staffRepository.findAll();
    }

    public Optional<Staff> getby(int id) {
        return staffRepository.findById(id);
    }

    public void delete(int id) {
        staffRepository.deleteById(id);
    }

    public void update(Staff staff) {
        staffRepository.saveAndFlush(staff);
    }
}



