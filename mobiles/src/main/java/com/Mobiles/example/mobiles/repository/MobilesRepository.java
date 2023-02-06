package com.Mobiles.example.mobiles.repository;

import com.Mobiles.example.mobiles.entity.MobilesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobilesRepository extends JpaRepository<MobilesEntity,Integer> {
}
