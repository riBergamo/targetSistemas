package org.example.exercicio3;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;

public class Distribuidora {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            // Carregar os dados do arquivo JSON em uma lista de objetos
            List<Faturamento> faturamentoDiario = objectMapper.readValue(new File("src/main/resources/dias.json"), new TypeReference<List<Faturamento>>(){});

            int diasUteis = 0;
            double soma = 0;

            for (Faturamento faturamento : faturamentoDiario) {

                if (faturamento.getValor() > 0) {
                    soma += faturamento.getValor();
                    diasUteis++;
                }
            }

            //a
            double menorFaturamento = faturamentoDiario.get(0).getValor();
            for (Faturamento faturamento : faturamentoDiario) {//percorrendo todos os elementos da coleção faturamentoDiario, dia é so nome da var
                if (faturamento.getValor() < menorFaturamento && faturamento.getValor() > 0) {
                    menorFaturamento = faturamento.getValor();
                }
            }

            //b
            double maiorFaturamento = faturamentoDiario.get(0).getValor();
            for (Faturamento faturamento : faturamentoDiario) {
                if (faturamento.getValor() > menorFaturamento) {
                    maiorFaturamento = faturamento.getValor();
                }
            }

            //c
            double mediaMensal = 0;

//           if (faturamento.getValor() > 0) {
//                    soma += faturamento.getValor();
//           }

            if (diasUteis > 0) {
                mediaMensal = soma/diasUteis;
            }

            int diasAcimaDaMedia = 0;

            for (Faturamento faturamento : faturamentoDiario) {
                if (faturamento.getValor() > mediaMensal) {
                    diasAcimaDaMedia++;
                }
            }


            System.out.printf("Menor faturamento do mês: R$%.2f%n", menorFaturamento);
            System.out.printf("Maior faturamento do mês: R$%.2f%n", maiorFaturamento);
            System.out.println("Quantidade de dias no mês em que o valor de faturamento diário foi superior à média mensal: " + diasAcimaDaMedia);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//

}
