package com.github.sujankumarmitra.msscbreweryclient.client.v1;

import com.github.sujankumarmitra.msscbreweryclient.model.v1.ApiBeerV1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class BreweryBeerClientV1Test {
    protected String VALID_BEER_ID = "a-valid-id";
    protected BreweryBeerClientV1 clientUnderTest;

    @Test
    void givenValidBeerId_ShouldFetchBeer() {
        ApiBeerV1 beer = clientUnderTest.getBeerById(VALID_BEER_ID);
        assertNotNull(beer);
        assertEquals(VALID_BEER_ID, beer.getId());
        System.out.println(beer);
    }

    @Test
    void givenValidBeerToSave_ShouldSaveBeer() {

        ApiBeerV1 beerToSave = new ApiBeerV1();
        beerToSave.setName("A name");
        beerToSave.setStyle("A style");
        beerToSave.setUpc(12345L);

        ApiBeerV1 savedBeer = assertDoesNotThrow(() -> clientUnderTest.saveBeer(beerToSave));

        assertNotNull(savedBeer);
        assertEquals(beerToSave.getName(),savedBeer.getName());
        assertEquals(beerToSave.getStyle(),savedBeer.getStyle());
        assertEquals(beerToSave.getUpc(),savedBeer.getUpc());

        System.out.println(savedBeer);
    }

    @Test
    void givenValidBeerToUpdate_ShouldUpdateBeer() {

        ApiBeerV1 beerToUpdate = new ApiBeerV1();
        beerToUpdate.setId(VALID_BEER_ID);
        beerToUpdate.setName("A name");
        beerToUpdate.setStyle("A style");
        beerToUpdate.setUpc(12345L);

        assertDoesNotThrow(() -> clientUnderTest.updateBeer(beerToUpdate));

    }

    @Test
    void givenValidBeerIdToDelete_ShouldDeleteBeer() {
        assertDoesNotThrow(()-> clientUnderTest.deleteBeer(VALID_BEER_ID));
    }
}
