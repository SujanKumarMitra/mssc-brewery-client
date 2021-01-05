package com.github.sujankumarmitra.msscbreweryclient.model.v1;

public class ApiCreateBeerResponseV1 {

    private ApiBeerV1 createdBeer;

    public ApiCreateBeerResponseV1() {
    }

    public ApiCreateBeerResponseV1(ApiBeerV1 createdBeer) {
        this.createdBeer = createdBeer;
    }

    public ApiBeerV1 getCreatedBeer() {
        return createdBeer;
    }

    public void setCreatedBeer(ApiBeerV1 createdBeer) {
        this.createdBeer = createdBeer;
    }
}
