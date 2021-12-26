package com.tatu.project01.entity;

import com.tatu.project01.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student extends AbsEntity {
    @ManyToOne
    private User user;
    private String parentPhone;
}
