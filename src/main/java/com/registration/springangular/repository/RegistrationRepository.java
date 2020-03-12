package com.registration.springangular.repository;

import com.registration.springangular.domain.FdAccount;
import com.registration.springangular.domain.Registration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RegistrationRepository extends CrudRepository<Registration,Long> {
   Optional<Registration> findByName(String name);
}
