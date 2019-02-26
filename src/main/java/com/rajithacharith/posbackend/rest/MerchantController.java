package com.rajithacharith.posbackend.rest;

import com.rajithacharith.posbackend.beans.FoodItemBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/merchant")
public class MerchantController {
    private FoodItemBean foodItemBean;

    @PostMapping("/addFoodItem")
    public ResponseEntity addFoodItem(@RequestBody FoodItemBean foodItemBean){
        this.foodItemBean = foodItemBean;
        return new ResponseEntity(HttpStatus.OK);
    }
    @PostMapping("/changeFoodDetails")
    public ResponseEntity changeFoodDetails(@RequestBody FoodItemBean foodItemBean){
        return new ResponseEntity(HttpStatus.OK);
    }
    @PostMapping("/addPhotos")
    public ResponseEntity addPhotos(){
        return new ResponseEntity("HelloWorld",HttpStatus.OK);
    }

    @GetMapping("/checkOrders")
    public ResponseEntity checkOrders(){
        return new ResponseEntity("HelloWorld",HttpStatus.OK);
    }
    @GetMapping("/topSellingFoods")
    public ResponseEntity topFoods(){
        return new ResponseEntity("HelloWorld",HttpStatus.OK);
    }

}
