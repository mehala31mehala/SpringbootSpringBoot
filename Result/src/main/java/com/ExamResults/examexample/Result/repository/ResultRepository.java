package com.ExamResults.examexample.Result.repository;

import com.ExamResults.examexample.Result.entity.ResultEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository extends JpaRepository<ResultEntity,Integer> {
}
