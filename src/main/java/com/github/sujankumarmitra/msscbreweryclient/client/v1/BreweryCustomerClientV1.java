package com.github.sujankumarmitra.msscbreweryclient.client.v1;

import com.github.sujankumarmitra.msscbreweryclient.model.v1.ApiCustomerV1;

public interface BreweryCustomerClientV1 {

    ApiCustomerV1 getCustomerById(String customerId);

    ApiCustomerV1 saveCustomer(ApiCustomerV1 customer);

    void updateCustomer(ApiCustomerV1 customer);

    void deleteCustomer(String customerId);
}
