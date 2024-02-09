package org.example.exercicio2;

import java.util.Scanner;

public class SequenciaDeFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para ver se pertence à sequência de Fibonacci: ");
        int num = scanner.nextInt();

        int primeiroNum = 0;
        int segundoNum = 1;
        boolean existeEmFibonacci = false;

        while (segundoNum <= num) {
            if (segundoNum == num) {
                existeEmFibonacci = true;
                break;
            }

            int soma = primeiroNum + segundoNum;
            primeiroNum = segundoNum;
            segundoNum = soma;
        }

        if (existeEmFibonacci) {
            System.out.println("O número " + num + " pertence a sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " NÃO pertence a sequência de Fibonacci.");
        }

        scanner.close();
    }
}
