package org.example.q1.strategy;

import org.example.q1.strategy.impl.BubbleSort;
import org.example.q1.strategy.impl.InsertionSort;
import org.example.q1.strategy.impl.QuickSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


/**
 * StrategyController
 * Classe criada apenas para testar o padrão Strategy
 */
public class StrategyController {

    private List<User> users;

    private Quick quick;
    private Bubble bubble;
    private Insertion insertion;

    public StrategyController() {
        this.users = this.generateUsers();
        this.quick = new Quick();
        this.bubble = new Bubble();
        this.insertion = new Insertion();

    }

    public void loopOptions(){
        int option = 0;

        do {
            System.out.println("####################################################");
            System.out.println("Opções de ordenação:");
            System.out.println("1 - Ordenar com Bubble Sort");
            System.out.println("2 - Ordenar com Insertion Sort");
            System.out.println("3 - Ordenar com Quick Sort");
            System.out.println("4 - embaralhar lista");
            System.out.println("5 - imprimir lista");
            System.out.println("0 - voltar");

            System.out.print("Digite o número da opção desejada: ");
            option = new Scanner(System.in).nextInt();

            switch (option) {
                case 1:
                    System.out.println("Bubble Sort");
                    quick.sort(users);
                    break;
                case 2:
                    System.out.println("Insertion Sort");
                    insertion.sort(users);
                    break;
                case 3:
                    System.out.println("Quick Sort");
                    bubble.sort(users);
                    break;
                case 4:
                    System.out.println("Embaralhar lista");
                    Collections.shuffle(this.users);
                    break;
                case 5:
                    System.out.println("Imprimir lista");
                    this.printUsers();
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

    private List<User> generateUsers(){

        List<User> users = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int age = (int) (Math.random() * 100);
            users.add(new User("User " + i, age));
        }
        return users;
    }

    private void printUsers(){
        System.out.println("Lista de usuários:");
        for (User user : this.users) {
            System.out.println("Nome: " + user.getName() + " - Idade: " + user.getAge());
            System.out.println("----------------------------------------------------");
        }
    }
}
