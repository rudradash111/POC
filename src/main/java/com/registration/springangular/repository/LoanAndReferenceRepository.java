package com.registration.springangular.repository;

import com.registration.springangular.domain.AssetLiability;
import com.registration.springangular.domain.Home;
import com.registration.springangular.domain.LoanAndReferenceType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LoanAndReferenceRepository extends CrudRepository<LoanAndReferenceType,Long> {
    Optional<LoanAndReferenceType> findById(Long Id);
    Optional<LoanAndReferenceType>findByReferenceNumber(String referenceNumber);
}
