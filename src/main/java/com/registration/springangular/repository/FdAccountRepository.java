package com.registration.springangular.repository;

import com.registration.springangular.domain.FdAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FdAccountRepository extends CrudRepository<FdAccount,Long> {
}
