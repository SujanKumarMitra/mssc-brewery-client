package com.github.sujankumarmitra.msscbreweryclient.model.v1;

public class ApiGetBeerResponseV1 {

    private ApiBeerV1 beer;

    public ApiGetBeerResponseV1() {
    }

    public ApiGetBeerResponseV1(ApiBeerV1 beer) {
        this.beer = beer;
    }

    public ApiBeerV1 getBeer() {
        return beer;
    }

    public void setBeer(ApiBeerV1 beer) {
        this.beer = beer;
    }
}
