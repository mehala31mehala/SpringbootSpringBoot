package com.ExamResults.examexample.Result.service;

import com.ExamResults.examexample.Result.entity.ResultEntity;
import com.ExamResults.examexample.Result.repository.ResultRepository;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ResultService {
    @Autowired
    public ResultRepository repository;
    public String save(ResultEntity result){
        repository.saveAndFlush(result);
        return "save";
    }
    public ResultEntity save(List<ResultEntity> obj1){
        List<ResultEntity> obj2=new ArrayList<>();
        ResultEntity obj3=null;
        for(ResultEntity obj4:obj1){
            obj3= new ResultEntity();
            repository.saveAndFlush(obj4);
        }
        return obj3;
    }

    public List<ResultEntity> getall() {
        return repository.findAll();
    }

    public Optional<ResultEntity> getById(int id) {
        return repository.findById(id);
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public String update( ResultEntity result) {
        repository.saveAndFlush(result);
        return "ok";
    }
}
