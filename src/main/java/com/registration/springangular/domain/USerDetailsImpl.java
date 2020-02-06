//package com.registration.springangular.domain;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//import java.util.Set;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//
//public class USerDetailsImpl extends User implements UserDetails {
//    public USerDetailsImpl(final User users) {
//        super(users);
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//
//        Set<Role> roles= getRoles();
//        roles.stream().map(new Function<Role, GrantedAuthority>() {
//            @Override
//            public GrantedAuthority apply(Role role) {
//                return new SimpleGrantedAuthority(role.getRole());
//                }
//                }).collect((Collectors.toSet()));
//        return null;
//            }
//
//
//
//
//    @Override
//    public String getPassword() {
//        return super.getPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        return super.getFirstName();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}
