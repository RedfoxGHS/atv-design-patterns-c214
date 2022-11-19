package org.example.q2;

import org.example.q2.observers.impl.CountWordsThatStartWithCapitalLetter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountWordsThatStartWithCapitalLetterTests {

    private CountWordsThatStartWithCapitalLetter countWordsThatStartWithCapitalLetter;

    @BeforeEach
    public void setUp() {
        countWordsThatStartWithCapitalLetter = new CountWordsThatStartWithCapitalLetter();
    }

    @Test
    public void testCountWordsThatStartWithCapitalLetterCountingWordsThatStartWithCapitalLetter() {

        String text = "Teste de unidade";

        countWordsThatStartWithCapitalLetter.count(text);

        assertEquals(1, countWordsThatStartWithCapitalLetter.getCount());
    }

    @Test
    public void testCountWordsThatStartWithCapitalLetterCountingWordsThatStartWithCapitalLetterWithEmptyText() {

        String text = "";

        countWordsThatStartWithCapitalLetter.count(text);

        assertEquals(0, countWordsThatStartWithCapitalLetter.getCount());
    }
}
