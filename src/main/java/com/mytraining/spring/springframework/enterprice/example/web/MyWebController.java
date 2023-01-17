package com.mytraining.spring.springframework.enterprice.example.web;

import com.mytraining.spring.springframework.enterprice.example.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyWebController {

    BusinessService businessService;

    @Autowired
    public MyWebController(BusinessService businessService){
        this.businessService = businessService;
    }
    public long returnValueFromWebService(){
        return businessService.calculateSum();
    }
}


