package com.Mobiles.example.mobiles.controller;

import com.Mobiles.example.mobiles.entity.MobilesEntity;
import com.Mobiles.example.mobiles.service.MobilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MobilesController {
    @Autowired
    public MobilesService service;

    @PostMapping("/set")
    private String save(@RequestBody MobilesEntity mobile) {
        service.save(mobile);
        return "done";
    }

    @PostMapping("/listdata")
    private String list(@RequestBody List<MobilesEntity> obj1) {
        MobilesEntity obj2 = service.save(obj1);
        return "listby";
    }
    @GetMapping("/setget")
    private List<MobilesEntity> getall(){
        return service.getall();

    }
    @GetMapping("/getby/{id}")
    private String getbyid(@PathVariable("id") int id){
       return service.getbyid(id);

    }
    @DeleteMapping("/dropid/{id}")
    private String delete(@PathVariable("id") int id){
        service.deleteById(id);
        return "drop";	
    }
    @PutMapping("/insertit")
    private String update(@RequestBody MobilesEntity mobile){
       service.save(mobile);
       return "update";
    }
}
