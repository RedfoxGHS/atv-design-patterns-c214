package org.example.q1.strategy.impl;

import org.example.q1.strategy.Sort;
import org.example.q1.strategy.User;

import java.util.List;

public class BubbleSort implements Sort {

    @Override
    public List<User> sortByAge(List<User> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j).getAge() > list.get(j + 1).getAge()) {
                    User aux = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, aux);
                }
            }
        }
        return list;
    }
}
