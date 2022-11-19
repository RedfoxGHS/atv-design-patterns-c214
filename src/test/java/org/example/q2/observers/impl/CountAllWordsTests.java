package org.example.q2.observers.impl;

import org.example.q2.observers.Observer;
import org.example.q2.observers.impl.CountAllWords;
import org.example.q2.observers.impl.ObserverImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountAllWordsTests {

    private CountAllWords countAllWords;

    @BeforeEach
    public void setup() {
        countAllWords = new CountAllWords();
    }

    @Test
    public void testCountAllWordsGetObserversEmpty() {

        assertEquals(0, countAllWords.getObservers().size());
    }

    @Test
    public void testCountAllWordsAddObserver() {

        Observer observer = new ObserverImpl("Observer 1");

        countAllWords.addObserver(observer);

        assertEquals(1, countAllWords.getObservers().size());
    }

    @Test
    public void testCountAllWordsRemoveObserver() {

        Observer observer = new ObserverImpl("Observer 1");

        countAllWords.addObserver(observer);
        countAllWords.removeObserver(observer);

        assertEquals(0, countAllWords.getObservers().size());
    }

    @Test
    public void testCountAllWordsCountingAllWords() {

        String text = "teste de unidade";

        countAllWords.count(text);

        assertEquals(3, countAllWords.getCount());
    }

    @Test
    public void testCountAllWordsCountingAllWordsWithEmptyText() {

        String text = "";

        countAllWords.count(text);

        assertEquals(0, countAllWords.getCount());
    }
}
