package com.Food.example.service;

import com.Food.example.entity.FoodCompany;
import com.Food.example.repository.FoodRepository;
import com.Food.example.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FoodService {
    @Autowired
    private FoodRepository foodRepository;
    @Autowired
    private ProductsRepository productsRepository;

    public String save(FoodCompany food){
        foodRepository.saveAndFlush(food);
        return "ok";
    }

    public  FoodCompany listall(List<FoodCompany> obj1) {
        List<FoodCompany> obj2=new ArrayList<>();
        FoodCompany obj3=null;
        for(FoodCompany obj4:obj1){
            obj3=new FoodCompany();
            foodRepository.save(obj4);
        }
        return obj3;
    }

    public List<FoodCompany> getAll() {
        return foodRepository.findAll();
    }

    public Optional<FoodCompany> getby(int id) {
        return foodRepository.findById(id);
    }

    public void delete(int id) {
        foodRepository.deleteById(id);
    }

    public void update(FoodCompany country) {
        foodRepository.saveAndFlush(country);
    }

}

