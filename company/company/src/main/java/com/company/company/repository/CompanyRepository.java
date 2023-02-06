package com.company.company.repository;

import com.company.company.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Optional;


@Repository
public interface CompanyRepository extends JpaRepository<Company,Integer> {
    @Query(value = "select * from company ", nativeQuery = true)
    Optional<Company> getAll1();

    @Query(value = "select id,name from company", nativeQuery = true)
    Optional<Company> getBy(int id);

}

