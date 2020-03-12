package com.registration.springangular.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Set;

@lombok.Getter
@lombok.Setter
@Entity
@Table(name = "auth_user")
/*class is used for handling user information like login.logut,role for that particular user*/
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="auth_user_id")
    private Long id;
    @Column(name = "user_name", nullable = true)
    String userName;
    @NotNull(message = "password may not be null")
    @Column(name = "password", nullable = true)
    String password;
    @NotNull(message = "email should not be null")
    @Column(name = "email")
    String email;
    /* @JoinTable it mostly useed to create new extrra table on two entity*/
    /* it will crete two coloumn name auth_user_id,auth_role_id inside table auth_user_role */
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinTable (name="auth_user_role",joinColumns = @JoinColumn(name ="u_id" ),
            inverseJoinColumns = @JoinColumn(name = "r_id"))
    private Set<Role> roles;

//    public User(User users) {
////        this.active = users.getActive();
//        this.userName = users.getUserName();
//        this.email = users.getEmail();
//        this.password = users.getPassword();
//        this.roles = users.getRoles();
//
//
//    }

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
