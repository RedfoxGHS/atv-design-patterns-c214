package org.example;

import org.example.q1.strategy.StrategyController;
import org.example.q2.observers.ObserverManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ObserverManager observerManager = new ObserverManager();
        StrategyController strategyController = new StrategyController();
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
        System.out.println("##### Atividade de C214 - Design Patterns #####");
        int option = 0;
        do{
            System.out.println("#####################################################################");
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Strategy");
            System.out.println("2 - Observer");
            System.out.println("0 - Sair");
            System.out.print("Digite o número da opção desejada: ");
            option = new Scanner(System.in).nextInt();

            switch (option) {
                case 1:
                    System.out.println("Strategy");
                    strategyController.loopOptions();
                    break;
                case 2:
                    System.out.println("Observer");
                    observerManager.loopOptions();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while (option != 0);
    }
}