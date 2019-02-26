package com.rajithacharith.posbackend.rest;

import com.rajithacharith.posbackend.beans.OrderBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    @RequestMapping("/addOrder")
    public ResponseEntity addOrder(@RequestBody OrderBean orderBean){
        return new ResponseEntity(HttpStatus.OK);
    }
    @RequestMapping("/cancelOrder")
    public ResponseEntity cancleOrder(){
        return new ResponseEntity(HttpStatus.OK);
    }
    @RequestMapping("/checkOrders")
    public ResponseEntity checkOrders(){
        return new ResponseEntity(HttpStatus.OK);
    }
    @RequestMapping("/addReview")
    public ResponseEntity addReview(){
        return new ResponseEntity(HttpStatus.OK);
    }
}
