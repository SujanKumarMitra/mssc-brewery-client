package com.github.sujankumarmitra.msscbreweryclient.client.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BreweryCustomerClientImplV1Test extends BreweryCustomerClientV1Test {

    @Autowired
    public BreweryCustomerClientImplV1Test(BreweryCustomerClientImplV1 customerClient) {
        super.clientUnderTest = customerClient;
    }
}
