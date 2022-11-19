package org.example.q2.observers;

import org.example.q2.observers.impl.CountAllWords;
import org.example.q2.observers.impl.CountEvenWords;
import org.example.q2.observers.impl.CountWordsThatStartWithCapitalLetter;
import org.example.q2.observers.impl.ObserverImpl;

import java.util.Scanner;


/**
 * ObserverManager class
 * Classe criada apenas para testar os observers
 */
public class ObserverManager {

    private CountAllWords countAllWords;
    private CountEvenWords countEvenWords;
    private CountWordsThatStartWithCapitalLetter countWordsThatStartWithCapitalLetter;

    private ObserverImpl observer1;
    private ObserverImpl observer2;
    private ObserverImpl observer3;

    public ObserverManager() {
        countAllWords = new CountAllWords();
        countEvenWords = new CountEvenWords();
        countWordsThatStartWithCapitalLetter = new CountWordsThatStartWithCapitalLetter();

        observer1 = new ObserverImpl("Chris");
        observer2 = new ObserverImpl("Uttoni");
        observer3 = new ObserverImpl("Luana");

        countAllWords.addObserver(observer1);
        countAllWords.addObserver(observer2);
        countAllWords.addObserver(observer3);

        countEvenWords.addObserver(observer2);

        countWordsThatStartWithCapitalLetter.addObserver(observer3);
    }

    public void loopOptions() {
        int option = 0;

        do {
            System.out.println("#####################################################################");
            System.out.println("Observadores já adicionados como padrão:");
            System.out.println("Chris: [Contar todas as palavras]");
            System.out.println("Uttoni: [Contar todas as palavras, Contar palavras pares]");
            System.out.println("Luana: [Contar todas as palavras, Contar palavras que começam com letra maiúscula]");
            System.out.println("\n#####################################################################");
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Notificar observadores de \" Contar todas as palavras \".");
            System.out.println("2 - Notificar observadores de \" Contar palavras pares \".");
            System.out.println("3 - Notificar observadores de \" Contar palavras que começam com letra maiúscula \".");
            System.out.println("4 - Adicionar um novo observador");
            System.out.println("5 - Remover um todas as assinaturas do Uttoni");
            System.out.println("0 - Voltar");
            System.out.print("Digite o número da opção desejada: ");
            option = new Scanner(System.in).nextInt();

            switch (option) {
                case 1:
                    System.out.println("Contar todas as palavras da frase");
                    System.out.print("Digite a frase: ");
                    String text = new Scanner(System.in).nextLine();
                    countAllWords.count(text);
                    break;
                case 2:
                    System.out.println("Contar palavras pares");
                    System.out.print("Digite a frase: ");
                    text = new Scanner(System.in).nextLine();
                    countEvenWords.count(text);
                    break;
                case 3:
                    System.out.println("Contar palavras que começam com letra maiúscula");
                    System.out.print("Digite a frase: ");
                    text = new Scanner(System.in).nextLine();
                    countWordsThatStartWithCapitalLetter.count(text);
                    break;
                case 4:
                    System.out.println("Adicionar um novo observador");
                    System.out.print("Digite o nome do novo observador: ");
                    String name = new Scanner(System.in).nextLine();
                    ObserverImpl observer = new ObserverImpl(name);
                    this.addNewObserverInSomeObservable(observer);
                    break;
                case 5:
                    countAllWords.removeObserver(observer2);
                    countEvenWords.removeObserver(observer2);
                    break;
                case 0:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while (option != 0);
    }

    private void addNewObserverInSomeObservable(ObserverImpl observer) {
        int option = 0;
        System.out.println("\n#####################################################################");
        System.out.println("Adicionando o novo observador em algum observável");
        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("1 - Contar todas as palavras");
        System.out.println("2 - Contar palavras pares");
        System.out.println("3 - Contar palavras ímpares");
        System.out.println("0 - Voltar");
        do {
            System.out.print("Digite o número da opção desejada: ");
            option = new Scanner(System.in).nextInt();

            switch (option) {
                case 1:
                    countAllWords.addObserver(observer);
                    break;
                case 2:
                    countEvenWords.addObserver(observer);
                    break;
                case 3:
                    countWordsThatStartWithCapitalLetter.addObserver(observer);
                    break;
                case 0:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while (option != 0);
    }
}
