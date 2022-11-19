package org.example.q2.observers.impl;

import org.example.q2.observers.impl.CountEvenWords;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountEvenWordsTests {

    private CountEvenWords countEvenWords;

    @BeforeEach
    public void setUp() {
        countEvenWords = new CountEvenWords();
    }

    @Test
    public void testCountEvenWordsCountingEvenWords() {

        String text = "teste de unidade";

        countEvenWords.count(text);

        assertEquals(1, countEvenWords.getCount());
    }

    @Test
    public void testCountEvenWordsCountingEvenWordsWithEmptyText() {

        String text = "";

        countEvenWords.count(text);

        assertEquals(0, countEvenWords.getCount());
    }
}
