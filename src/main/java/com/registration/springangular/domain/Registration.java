package com.registration.springangular.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity()
@Getter
@Setter
@Table(name = "registration")
public class Registration {
    private static final long serialVersionUID = 1L;
    @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    public Long regId;
    public String name;
    public String email;
    public String  password;
    public Long getRegId() {
        return regId;
    }

    public void setRegId(Long regId) {
        this.regId = regId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
