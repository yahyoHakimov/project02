package com.tatu.project01.entity;

import com.tatu.project01.entity.enums.RoleName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Role implements GrantedAuthority {

    @Id
    private Integer id;

    private RoleName roleName;

    @Override
    public String getAuthority() {
        return roleName.name();
    }
}
