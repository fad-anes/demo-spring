package com.example.demo.contoller;

import com.example.demo.model.entity.employee;
import com.example.demo.service.empserv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/employee")
public class empcontr {
    @Autowired
    private empserv empserv;
    @GetMapping("/get-emp")
    public employee getUser(@RequestParam Integer id){
        return empserv.getUser(id);
    }
}
