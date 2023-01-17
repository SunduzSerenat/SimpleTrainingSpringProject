package com.mytraining.spring.springframework.enterprice.example.data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataServiceTest {

    private DataService dataService;
    private int number=8;
    @BeforeEach
    void setUp() {
        dataService = new DataService(number);
    }

    @Test
    void WhenControlOfNumber(){
        int num = dataService.getNumber();
        Assertions.assertEquals(num, number);
    }
}