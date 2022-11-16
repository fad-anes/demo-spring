package com.example.demo.contoller;

import com.example.demo.model.dto.empdto;
import com.example.demo.model.entity.employee;
import com.example.demo.service.empserv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class empcontr {
    @Autowired
    private empserv empserv;
    @GetMapping("/get-emp")
    public empdto getUser(@RequestParam Integer id){
        return empserv.getUser(id);
    }
    @PostMapping("/update-emp")
    public empdto update(@RequestBody empdto employee){
        return empdto.toDto(empserv.save(employee));
    }
    @GetMapping("/delete-emp")
    public void delete(@RequestParam Integer id){
         empserv.delete(id);

    }
    @PostMapping("/save-emp")
    public empdto save(@RequestBody empdto employee){
        return empserv.saveemp(employee);
    }
    @GetMapping("/get-all")
    public List<employee> getall(){
        return this.empserv.getall();
    }
}
