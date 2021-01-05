package com.github.sujankumarmitra.msscbreweryclient.client.v1;

import com.github.sujankumarmitra.msscbreweryclient.model.v1.ApiBeerV1;
import com.github.sujankumarmitra.msscbreweryclient.model.v1.ApiCreateBeerResponseV1;
import com.github.sujankumarmitra.msscbreweryclient.model.v1.ApiGetBeerResponseV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BreweryBeerClientImplV1 implements BreweryBeerClientV1 {

    private final String API_REQUEST_PATH = "/api/v1/beer";
    private RestTemplate restTemplate;

    @Autowired
    public BreweryBeerClientImplV1(RestTemplateBuilder restTemplateBuilder, @Value("${app.brewery.base-url}") String hostBaseUrl) {
        this.restTemplate = restTemplateBuilder.rootUri(hostBaseUrl).build();
    }

    @Override
    public ApiBeerV1 getBeerById(String beerId) {
        return restTemplate
                .getForObject(API_REQUEST_PATH + "/{beerId}", ApiGetBeerResponseV1.class, beerId)
                .getBeer();
    }

    @Override
    public ApiBeerV1 saveBeer(ApiBeerV1 beer) {
        return restTemplate
                .postForObject(API_REQUEST_PATH, beer, ApiCreateBeerResponseV1.class)
                .getCreatedBeer();
    }

    @Override
    public void updateBeer(ApiBeerV1 beerToUpdate) {
        restTemplate.put(API_REQUEST_PATH + "/{beerId}", beerToUpdate, beerToUpdate.getId());
    }

    @Override
    public void deleteBeer(String beerId) {
        restTemplate.delete(API_REQUEST_PATH + "/{beerId}", beerId);
    }
}
