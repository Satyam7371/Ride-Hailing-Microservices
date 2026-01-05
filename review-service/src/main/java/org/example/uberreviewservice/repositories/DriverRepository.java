package org.example.uberreviewservice.repositories;

import org.example.uberreviewservice.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DriverRepository extends JpaRepository<Driver,Long> {


    Optional<Driver> findByIdAndLicenseNumber(Long id, String licenseNumber);
    // it is recomended not to use above way executing query but to Query for the same 2 type i,e

//    // raw query, error can be detected at runtime only making it less useful than hibernate Query
//    @Query(nativeQuery = true, value = "SELECT * from Driver where id = :id AND license_number = :license")
//    Optional<Driver> rawFindByIdAndLicenseNumber(Long id, String license);
//
//    // hibernate Query, error can be detected at compile time
//    @Query("Select d from Driver as d Where d.id = :id AND d.licenseNumber = :license")
//    Optional<Driver> hqlFindByIdAndLicenseNumber(Long id, String license);


    List<Driver> findAllByIdIn(List<Long> driverIds);
}
