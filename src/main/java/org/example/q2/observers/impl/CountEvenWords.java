package org.example.q2.observers.impl;

import org.example.q2.observers.Observable;
import org.example.q2.observers.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CountEvenWords implements Observable {

    private List<Observer> observers;

    private String text;
    private int count = 0;

    public CountEvenWords() {
        observers = new ArrayList<>();
    }

    public void count(String text) {
        String[] words = text.split(" ");
        for (String word : words) {
            if (word.length() % 2 == 0) {
                count++;
            }
        }
        System.out.println("Total de palavras pares: " + count);
        this.text = text;
        notifyObservers();
    }

    public void addObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
            System.out.println("Observador foi adicionado com sucesso no Observável \" Contar palavras pares \".");
            return;
        }
        System.out.println("Observador já está adicionado no Observável \" Contar palavras pares \".");
    }

    public void removeObserver(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
            System.out.println("Observador foi removido com sucesso do Observável \" Contar palavras pares \".");
            return;
        }
        System.out.println("Observador não está adicionado no Observável \" Contar palavras pares \".");
    }

    public void notifyObservers() {
        System.out.println("\n#####################################################################");
        System.out.println("Notificando Observadores...");
        System.out.println("---------------------------");
        for (Observer observer : observers) {
            observer.update(this);
            System.out.println("---------------------------");
        }
    }

    @Override
    public String toString() {
        return "O texto \"" + text + "\" possui " + count + " palavras pares.";
    }
}