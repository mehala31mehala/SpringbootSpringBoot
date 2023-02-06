package com.ExamResults.examexample.Result.controller;

import com.ExamResults.examexample.Result.entity.ResultEntity;
import com.ExamResults.examexample.Result.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ResultController {
    @Autowired
    public ResultService service;
    @PostMapping("/done")
    private String save(@RequestBody  ResultEntity result){
        service.save(result);
        return "ok";
    }
    @PostMapping("/post")
    private String list(@RequestBody List<ResultEntity> obj1){
        ResultEntity obj3=service.save(obj1);
        return  "done";
    }
    @GetMapping("/get")
    private List<ResultEntity> getall(){
        return service.getall();
    }
    @GetMapping("/getit/{id}")
    private Optional<ResultEntity> getby(@PathVariable("id") int id){
        return service.getById(id);
    }
    @DeleteMapping("/delete/{id}")
    private String delete(@PathVariable("id") int id){
        service.deleteById(id);
        return "yes";
    }
    @PutMapping("/update")
    private String update(@RequestBody ResultEntity result){
        service.update(result);
        return "update";
    }
}
