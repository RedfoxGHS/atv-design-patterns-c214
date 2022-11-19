package org.example.q2.observers;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers() throws InterruptedException;
}
