package de.cristiano.marathon.daily;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Day14Test {

    private final Day14 day14 = new Day14();

    @Test
    void shouldHaveBoughtAt() {
        //Given
        int[] stockPrices = {9, 11, 8, 5, 7, 10};

        //When
        final int bestPrice = day14.shouldHaveBoughtAt(stockPrices);

        //Then
        assertThat(bestPrice, is(5));
    }
}