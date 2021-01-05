package com.github.sujankumarmitra.msscbreweryclient.client.v1;

import com.github.sujankumarmitra.msscbreweryclient.model.v1.ApiCreateCustomerResponseV1;
import com.github.sujankumarmitra.msscbreweryclient.model.v1.ApiCustomerV1;
import com.github.sujankumarmitra.msscbreweryclient.model.v1.ApiGetCustomerResponseV1;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BreweryCustomerClientImplV1 implements BreweryCustomerClientV1 {

    private final String API_REQUEST_PATH = "/api/v1/customer";
    private RestTemplate restTemplate;

    public BreweryCustomerClientImplV1(RestTemplateBuilder restTemplateBuilder, @Value("${app.brewery.base-url}") String baseUrl) {
        this.restTemplate = restTemplateBuilder.rootUri(baseUrl).build();
    }

    @Override
    public ApiCustomerV1 getCustomerById(String customerId) {
        return restTemplate
                .getForObject(API_REQUEST_PATH + "/{customerId}", ApiGetCustomerResponseV1.class, customerId)
                .getCustomer();
    }

    @Override
    public ApiCustomerV1 saveCustomer(ApiCustomerV1 customer) {
        return restTemplate
                .postForObject(API_REQUEST_PATH, customer, ApiCreateCustomerResponseV1.class)
                .getCreatedCustomer();
    }

    @Override
    public void updateCustomer(ApiCustomerV1 customer) {
        restTemplate.put(API_REQUEST_PATH + "/{customerId}", customer, customer.getId());
    }

    @Override
    public void deleteCustomer(String customerId) {
        restTemplate.delete(API_REQUEST_PATH + "/{customerId}", customerId);
    }
}
