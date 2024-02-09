package org.example.exercicio5;

import java.util.Scanner;

public class InvertendoString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        char[] caracteres = frase.toCharArray();//para pegar cada char separadamente

        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {
            char i = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = i;

            inicio++;
            fim--;
        }

        System.out.println(caracteres);
    }
}
