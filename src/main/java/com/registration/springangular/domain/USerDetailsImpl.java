package com.registration.springangular.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

@Getter
@Setter
public class USerDetailsImpl implements UserDetails {
    public User users;

//used for providing authority
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        Set<Role> roles= users.getRoles();
        roles.stream().map(new Function<Role, GrantedAuthority>() {
            @Override
            public GrantedAuthority apply(Role role) {
                return new SimpleGrantedAuthority(role.getRole());
                }
                }).collect((Collectors.toSet()));
               return null;
            }




    @Override
    public String getPassword() {
        return users.getPassword();
    }

    @Override
    public String getUsername() {
        return users.getUserName();
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

    public void setUser(User userDetails) {
        this.users=userDetails;
    }
}
