package com.github.sujankumarmitra.msscbreweryclient.client.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles({"dev"})
class BreweryBeerClientImplV1Test extends BreweryBeerClientV1Test {

    @Autowired
    public BreweryBeerClientImplV1Test(BreweryBeerClientImplV1 breweryBeerClient) {
        super.clientUnderTest = breweryBeerClient;
    }
}