package com.example.demo.service;
import com.example.demo.model.dto.empdto;
import com.example.demo.model.entity.employee;
import com.example.demo.repository.empRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class empserv {
    @Autowired
    private empRepo empRepo;
    public empdto getUser(Integer id){
        Optional<employee> emp =this.empRepo.findById(id);
        if(emp.isPresent())
            return empdto.toDto(emp.get());
        else
            return null;
    }
    public empdto saveemp(empdto empl){
        return empdto.toDto(empRepo.save(employee.toEntity(empl)));
    }
    public employee save(empdto empl){
        return this.empRepo.save(employee.toEntity(empl));
    }
    public void delete(Integer id) {
        this.empRepo.deleteById(id);
    }

    public List<employee> getall() {
       return this.empRepo.findAll();
    }
}
