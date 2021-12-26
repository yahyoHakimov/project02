package com.tatu.project01.entity;

import com.tatu.project01.entity.enums.PermissionName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Permission implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)
    private PermissionName permissionName;

    @Override
    public String getAuthority() {
        return permissionName.name();
    }

    public Permission(PermissionName permissionName) {
        this.permissionName = permissionName;
    }
}