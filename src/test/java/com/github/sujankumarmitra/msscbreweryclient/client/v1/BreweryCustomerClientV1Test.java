package com.github.sujankumarmitra.msscbreweryclient.client.v1;

import com.github.sujankumarmitra.msscbreweryclient.model.v1.ApiCustomerV1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class BreweryCustomerClientV1Test {
    protected String VALID_CUSTOMER_ID = "a-valid-id";
    protected BreweryCustomerClientV1 clientUnderTest;

    @Test
    void givenValidBeerId_ShouldFetchBeer() {
        ApiCustomerV1 customer = clientUnderTest.getCustomerById(VALID_CUSTOMER_ID);
        assertNotNull(customer);
        assertEquals(VALID_CUSTOMER_ID, customer.getId());
        System.out.println(customer);
    }

    @Test
    void givenValidBeerToSave_ShouldSaveBeer() {

        ApiCustomerV1 customerToSave = new ApiCustomerV1();
        customerToSave.setName("A name");

        ApiCustomerV1 savedBeer = assertDoesNotThrow(() -> clientUnderTest.saveCustomer(customerToSave));

        assertNotNull(savedBeer);
        assertEquals(customerToSave.getName(),savedBeer.getName());

        System.out.println(savedBeer);
    }

    @Test
    void givenValidBeerToUpdate_ShouldUpdateBeer() {

        ApiCustomerV1 customerToUpdate = new ApiCustomerV1();
        customerToUpdate.setId(VALID_CUSTOMER_ID);
        customerToUpdate.setName("A name");

        assertDoesNotThrow(() -> clientUnderTest.updateCustomer(customerToUpdate));

    }

    @Test
    void givenValidBeerIdToDelete_ShouldDeleteBeer() {
        assertDoesNotThrow(()-> clientUnderTest.deleteCustomer(VALID_CUSTOMER_ID));
    }
}
