package org.example.q1.strategy;

import java.util.List;

public abstract class Sorting {

    protected Sort sort;

    public List<User> sort(List<User> list){
        return sort.sortByAge(list);
    }

    public Sort getSort() {
        return sort;
    }
}
