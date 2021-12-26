package com.tatu.project01.Dto;

import com.tatu.project01.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private Integer id;
    private String fullName;
    private String phoneNumber;
    private String description;
    private Date birthDate;
    private String password;
    private String birthPlace;
    private Set<Role> roles;

    public StudentDto(String fullName, String phoneNumber, String description, Date birthDate, String password, String birthPlace, Set<Role> roles) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.description = description;
        this.birthDate = birthDate;
        this.password = password;
        this.birthPlace = birthPlace;
        this.roles = roles;
    }
}
