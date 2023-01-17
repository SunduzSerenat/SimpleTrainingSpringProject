package com.mytraining.spring.springframework.enterprice.example.business;

import com.mytraining.spring.springframework.enterprice.example.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class BusinessService {

    private String name = "I am Business Service";

    // If we write @Autowired for this definition. The injection type will be 'Field Injection'
    DataService dataService;

    //Injection type is 'Constructor Based Injection'
    @Autowired
    public BusinessService(DataService dataService){
        this.dataService = dataService;
    }

    // If we write @Autowired for this method. The injection type will be 'Setter Based Injection'
    public void setDataService(DataService dataService) {
        this.dataService = dataService;
    }

    public String getName(){
        return name;
    }

    public long calculateSum(){
        List<Integer> data = dataService.getData();
        return data.stream().reduce(Integer::sum).get();
    }

}
