package org.example.q1.strategy;

import org.example.q1.strategy.impl.QuickSort;

import java.util.List;

public class Quick extends Sorting{

    public Quick(){
        sort = new QuickSort();
    }
}
