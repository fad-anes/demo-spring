package com.example.demo.model.dto;

import com.example.demo.model.entity.employee;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class empdto {
    private Integer id;
    private String name;
    private String prename;
    private Double salary;

    public static empdto toDto(employee entity){
        return empdto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .prename(entity.getPrename())
                .salary(entity.getSalary())
                .build();

    }
}
