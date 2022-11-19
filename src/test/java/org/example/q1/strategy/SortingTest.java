package org.example.q1.strategy;

import org.example.q1.strategy.impl.BubbleSort;
import org.example.q1.strategy.impl.InsertionSort;
import org.example.q1.strategy.impl.QuickSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class SortingTest {

    private Sorting sorting;

    @Test
    public void testBubbleSort(){
        sorting = new Bubble();
        assertInstanceOf(BubbleSort.class, sorting.getSort());
    }

    @Test
    public void testQuickSort(){
        sorting = new Quick();
        assertInstanceOf(QuickSort.class, sorting.getSort());
    }

    @Test
    public void testInsertionSort(){
        sorting = new Insertion();
        assertInstanceOf(InsertionSort.class, sorting.getSort());
    }
}
