package org.example.q1.strategy.impl;

import org.example.q1.strategy.Sort;
import org.example.q1.strategy.User;

import java.util.List;

public class QuickSort implements Sort {

    @Override
    public List<User> sortByAge(List<User> list) {
        return quickSort(list, 0, list.size() - 1);
    }

    private List<User> quickSort(List<User> list, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int pivot = partition(list, leftIndex, rightIndex);
            quickSort(list, leftIndex, pivot - 1);
            quickSort(list, pivot + 1, rightIndex);
        }
        return list;
    }

    private int partition(List<User> list, int leftIndex, int rightIndex) {
        User pivot = list.get(rightIndex);
        int i = leftIndex;
        for (int j = leftIndex; j < rightIndex; j++) {
            if (list.get(j).getAge() <= pivot.getAge()) {
                User aux = list.get(i);
                list.set(i, list.get(j));
                list.set(j, aux);
                i++;
            }
        }
        User aux = list.get(i);
        list.set(i, list.get(rightIndex));
        list.set(rightIndex, aux);
        return i;
    }
}
