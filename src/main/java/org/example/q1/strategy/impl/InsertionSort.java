package org.example.q1.strategy.impl;

import org.example.q1.strategy.Sort;
import org.example.q1.strategy.User;

import java.util.List;

public class InsertionSort implements Sort {

    @Override
    public List<User> sortByAge(List<User> list) {
        for (int i = 1; i < list.size(); i++) {
            User aux = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j).getAge() > aux.getAge()) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, aux);
        }

        return list;
    }

}
