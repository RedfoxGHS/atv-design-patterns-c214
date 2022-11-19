package org.example.q2.observers.impl;

import org.example.q2.observers.Observable;
import org.example.q2.observers.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CountWordsThatStartWithCapitalLetter implements Observable {

    private List<Observer> observers;
    private String text;
    private int count;

    public CountWordsThatStartWithCapitalLetter() {
        observers = new ArrayList<>();
        count = 0;
    }

    public void count(String text) {
        String[] words = text.split(" ");
        if (words.length > 0) {
            for (String word : words) {
                if (word.length() > 0 && Character.isUpperCase(word.charAt(0))) {
                    count++;
                }
            }
        }
        this.text = text;
        System.out.println("Palavras que começam com letra maiúscula: " + count);
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
            System.out.println("Observador foi adicionado com sucesso no Observável \" Contar palavras que começam com letra maiúscula \".");
            return;
        }
        System.out.println("Observador já está adicionado no Observável \" Contar palavras que começam com letra maiúscula \".");
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
        return "The text: " + text + " has " + count + " words that start with capital letter.";
    }
}
