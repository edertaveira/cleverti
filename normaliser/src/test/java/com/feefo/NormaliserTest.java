package com.feefo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class NormaliserTest {

    @Test
    void shouldReturnClosestMatch_whenMatchExists() {
        Normaliser normaliser = new Normaliser();
        String input = "solutions architect";
        String expected = "Architect";
        String result = normaliser.normalise(input);
        assertEquals(expected, result);
    }

    @Test
    void shouldReturnClosestMatch_whenMatchExists2() {
        Normaliser normaliser = new Normaliser();
        String input = "python engineer";
        String expected = "Software engineer";
        String result = normaliser.normalise(input);
        assertEquals(expected, result);
    }

    @Test
    void shouldReturnNull_whenInputIsNull() {
        Normaliser normaliser = new Normaliser();
        String input = null;
        String result = normaliser.normalise(input);
        assertNull(result);
    }

    @Test
    void shouldReturnNull_whenInputIsEmpty() {
        Normaliser normaliser = new Normaliser();
        String input = "";
        String result = normaliser.normalise(input);
        assertNull(result);
    }

}
