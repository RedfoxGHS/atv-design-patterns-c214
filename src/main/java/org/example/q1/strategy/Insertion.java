package org.example.q1.strategy;

import org.example.q1.strategy.impl.InsertionSort;

import java.util.List;

public class Insertion extends Sorting{

    public Insertion(){
        sort = new InsertionSort();
    }
}
