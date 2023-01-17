package com.mytraining.spring.springframework.enterprice.example.business;

import com.mytraining.spring.springframework.enterprice.example.data.DataService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class BusinessServiceTest {

    /*
      In BusinessService test, the BusinessService elements should be just tested. Not other elements related to other classes.
     */
    final int num = 8;
    private BusinessService businessService;
    private DataService dataService;
    @BeforeEach
    void setUp() throws Exception{
        /*
          Mockito creates virtual service to test.
          Mockito is a feature of JUnit
          When you are using Mockito, this mock classes does not affect the code.
          So we can not get DataService data with mocking. Just it helps to create BusinessService.
         */

        dataService = Mockito.mock(DataService.class);
        //dataService = new DataService(num);
        businessService = new BusinessService(dataService);
    }

    // For this test DataService should not be mock class.
    @Test
    public void whenBusinessServiceCalculateSumUsingDataReceivedFromDataService(){
        long check = dataService.getData().stream().reduce(Integer::sum).get();
        assertEquals(businessService.calculateSum(), check);

    }

    @Test
    public void whenCheckNameOfBusinessService(){
        String name = businessService.getName();
        Assertions.assertEquals(name, "I am Business Service");
    }


}