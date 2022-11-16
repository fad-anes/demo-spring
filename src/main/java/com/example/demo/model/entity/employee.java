package com.example.demo.model.entity;

import com.example.demo.model.dto.empdto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLUpdate;


import javax.persistence.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class employee {
    @Id

    private Integer id;
    private String name;
    private String prename;
    private Double salary;

    public static employee toEntity(empdto dto){
        return employee.builder()
                .id(dto.getId())
                .name(dto.getName())
                .prename(dto.getPrename())
                .salary(dto.getSalary())
                .build();
    }
}
