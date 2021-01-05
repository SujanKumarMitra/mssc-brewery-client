package com.github.sujankumarmitra.msscbreweryclient.client.v1;

import com.github.sujankumarmitra.msscbreweryclient.model.v1.ApiBeerV1;

public interface BreweryBeerClientV1 {

    ApiBeerV1 getBeerById(String beerId);

    ApiBeerV1 saveBeer(ApiBeerV1 beer);

    void updateBeer(ApiBeerV1 beerToUpdate);

    void deleteBeer(String beerId);
}
