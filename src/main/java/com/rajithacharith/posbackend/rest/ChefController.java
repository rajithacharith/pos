package com.rajithacharith.posbackend.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chef")
public class ChefController {
    @RequestMapping("/viewOrders")
    public ResponseEntity viewOrders(){
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping("/markStatus")
    public ResponseEntity markStatus(){
        return new ResponseEntity(HttpStatus.OK);
    }
}
