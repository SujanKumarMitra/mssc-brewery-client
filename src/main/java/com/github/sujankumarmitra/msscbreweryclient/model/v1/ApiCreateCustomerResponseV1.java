package com.github.sujankumarmitra.msscbreweryclient.model.v1;

public class ApiCreateCustomerResponseV1 {

    private ApiCustomerV1 createdCustomer;

    public ApiCreateCustomerResponseV1() {
    }

    public ApiCreateCustomerResponseV1(ApiCustomerV1 createdCustomer) {
        this.createdCustomer = createdCustomer;
    }

    public ApiCustomerV1 getCreatedCustomer() {
        return createdCustomer;
    }

    public void setCreatedCustomer(ApiCustomerV1 createdCustomer) {
        this.createdCustomer = createdCustomer;
    }
}