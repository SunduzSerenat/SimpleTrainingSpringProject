package com.mytraining.spring.springframework.enterprice.example.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataService {

    private int number;

    @Autowired
    public DataService(int number){
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }

    public List<Integer> getData(){
        List<Integer> data = Arrays.asList(45, 67, 32, 23);
        return data;
    }
}
