package com.example.demo.service;
import com.example.demo.model.entity.employee;
import com.example.demo.repository.empRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class empserv {
    @Autowired
    private empRepo empRepo;
    public employee getUser(Integer id){
        Optional<employee> emp =this.empRepo.findById(id);
        return  emp.orElse(null);
    }
    public employee save(employee employee){
        return this.empRepo.save(employee);
    }
}
