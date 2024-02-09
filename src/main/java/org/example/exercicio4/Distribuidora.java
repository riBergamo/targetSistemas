package org.example.exercicio4;

public class Distribuidora {
    public static void main(String[] args) {

        String[] estados = {"SP", "RJ", "MG", "ES", "Outros"};

        double[] faturamentoPorEstado = {67836.43, 36678.66, 29229.88, 27165.48, 19849.53};

        //
        double faturamentoTotal = 0;
        for (double faturamento : faturamentoPorEstado) {
            faturamentoTotal += faturamento;
        }

        // % de representação de cada estado
        System.out.println("Percentual de representação de cada estado no faturamento mensal:");
        for (int i = 0; i < estados.length; i++) {
            double percentual = (faturamentoPorEstado[i]/faturamentoTotal) * 100;
            System.out.printf("%s: %.2f%%\n", estados[i], percentual);
        }
    }

}
