package org.example.q2.observers.impl;

import org.example.q2.observers.Observable;
import org.example.q2.observers.Observer;

import java.util.UUID;

public class ObserverImpl implements Observer {

    private int id = UUID.randomUUID().hashCode() & Integer.MAX_VALUE;

    private String name;

    public ObserverImpl(String name) {
        this.name = name;
    }

    public void update(Observable observable) {
        System.out.println("Observador " + name + " com id [" + id + "] foi notificado!");
        System.out.println("Observável: " + observable.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ObserverImpl observer = (ObserverImpl) o;

        if (id != observer.id) return false;
        return name.equals(observer.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }
}
