package com.Food.example.controller;

import com.Food.example.entity.FoodCompany;
import com.Food.example.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FoodController {
    @Autowired
    public FoodService foodService;

    @PostMapping("/insert")
    private String save(@RequestBody FoodCompany food) {
        foodService.save(food);
        return "done";
    }

    @PostMapping("/list")
    private String listall(@RequestBody List<FoodCompany> obj1) {
        FoodCompany obj2 = foodService.listall(obj1);
        return "done";
    }

    @GetMapping("/get")
    private List<FoodCompany> getAll() {
        return foodService.getAll();
    }

    @GetMapping("/getit/{id}")
    private Optional<FoodCompany> getby(@PathVariable("id") int id) {
        return foodService.getby(id);
    }

    @DeleteMapping("/delete/{id}")
    private String delete(@PathVariable("id") int id) {
        foodService.delete(id);
        return "deleted";
    }

    @PutMapping("/put")
    private String update(@RequestBody FoodCompany food) {
        foodService.update(food);
        return "super";
    }
}
