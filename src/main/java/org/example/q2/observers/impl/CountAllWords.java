package org.example.q2.observers.impl;

import org.example.q2.observers.Observable;
import org.example.q2.observers.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CountAllWords implements Observable {

    private List<Observer> observers;

    private String text;
    private int count;

    public CountAllWords() {
        observers = new ArrayList<>();
        count = 0;
    }

    public void count(String text) {
        if (text.length() > 0) {
            String[] words = text.split(" ");
            count = words.length;
        }
        System.out.println("Total de palavras: " + count);
        this.text = text;
        notifyObservers();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public String getText() {
        return text;
    }

    public int getCount() {
        return count;
    }

    public void addObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
            System.out.println("Observador foi adicionado com sucesso no Observável \" Contar todas as palavras \".");
            return;
        }
        System.out.println("Observador já está adicionado no Observável \" Contar todas as palavras \".");
    }

    public void removeObserver(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
            System.out.println("Observador foi removido com sucesso do Observável \" Contar todas as palavras \".");
            return;
        }
        System.out.println("Observador não está adicionado no Observável \" Contar todas as palavras \".");
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
        return "O texto \"" + text + "\" possui " + count + " palavras.";
    }
}