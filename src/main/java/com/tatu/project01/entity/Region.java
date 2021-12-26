package com.tatu.project01.entity;

import com.tatu.project01.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Region extends AbsEntity {
    private String name;
    private String description;


}
