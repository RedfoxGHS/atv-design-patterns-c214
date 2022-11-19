package org.example.q1.strategy;

import org.example.q1.strategy.impl.BubbleSort;

import java.util.List;

public class Bubble extends Sorting{

    public Bubble(){
        sort = new BubbleSort();
    }
}
