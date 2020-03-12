package com.registration.springangular.repository;

import com.registration.springangular.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

interface RoleRepository extends JpaRepository<Role,Long> {
}
