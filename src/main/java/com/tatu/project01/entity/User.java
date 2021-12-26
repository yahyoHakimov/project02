package com.tatu.project01.entity;

import com.tatu.project01.entity.enums.Gender;
import com.tatu.project01.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends AbsEntity implements UserDetails {

    private String fullName;
    private String phoneNumber;
    private String description;
    private Date birthDate;
    private String password;
    @OneToOne
    private Region birthPlace;
    @ManyToMany
    private Set<Role> roles;
    @ManyToMany
    private Set<Permission> permissions;
    private Gender gender;

    private boolean isAccountNonExpired = true;
    private boolean isAccountNonLocked = true;
    private boolean isCredentialsNonExpired = true;
    private boolean enabled = true;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<GrantedAuthority> grantedAuthorityList = new HashSet<>();
        if (permissions != null)
            grantedAuthorityList.addAll(permissions);
        grantedAuthorityList.addAll(roles);
        return grantedAuthorityList;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
