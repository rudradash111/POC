package com.registration.springangular.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "auth_role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
            @Column(name = "auth_role_id")
    Long id;
    @Column(name = "role_name")
    String role;
    @Column(name = "role_desc")
    String description;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
