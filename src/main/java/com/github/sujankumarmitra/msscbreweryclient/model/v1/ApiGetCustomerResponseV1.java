package com.github.sujankumarmitra.msscbreweryclient.model.v1;

public class ApiGetCustomerResponseV1 {
    private ApiCustomerV1 customer;

    public ApiGetCustomerResponseV1() {
    }

    public ApiCustomerV1 getCustomer() {
        return customer;
    }

    public void setCustomer(ApiCustomerV1 customer) {
        this.customer = customer;
    }
}
