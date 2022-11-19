package org.example.q1.strategy.impl;

import org.example.q1.strategy.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsertionSortTest {

    private InsertionSort insertionSort;

    @BeforeEach
    public void setUp() {
        insertionSort = new InsertionSort();
    }

    @Test
    public void testSortByAge() {

        List<User> list = new ArrayList<>(
                List.of(
                        new User("John", 35),
                        new User("Ana", 25),
                        new User("Paul", 30)
                )
        );

        List<User> sortedList = insertionSort.sortByAge(list);

        assertEquals(3, sortedList.size());
        assertEquals("Ana", sortedList.get(0).getName());
        assertEquals("Paul", sortedList.get(1).getName());
        assertEquals("John", sortedList.get(2).getName());
    }
}
