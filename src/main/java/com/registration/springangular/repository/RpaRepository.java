package com.registration.springangular.repository;

import com.registration.springangular.domain.AssetLiability;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public
interface RpaRepository extends CrudRepository<AssetLiability, Long> {
    Optional<AssetLiability> findById(Long Id);
}