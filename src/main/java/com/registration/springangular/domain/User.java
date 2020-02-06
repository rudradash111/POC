package com.registration.springangular.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Set;

@lombok.Getter
@lombok.Setter
@Entity
@Table(name = "auth_user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="auth_user_id")
    private Long id;
    @Column(name = "first_name", nullable = true)
    String firstName;
    @Column(name = "last_name", nullable = true)
    String lastName;
    @NotNull(message = "password may not be null")
    @Column(name = "password", nullable = true)
    String password;
    @NotNull(message = "email should not be null")
    @Column(name = "email")
    String email;
    @ManyToMany(cascade = {CascadeType.ALL})@JoinTable (name="auth_user_role",joinColumns = @JoinColumn(name ="auth_user_id" ),inverseJoinColumns = @JoinColumn(name = "auth_role_id"))
    private Set<Role> roles;

    public User(User users) {
//        this.active = users.getActive();
        this.email = users.getEmail();
        this.roles = users.getRoles();
        this.firstName = users.getFirstName();
        this.lastName =users.getLastName();
        this.id = users.getId();
        this.password = users.getPassword();
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
