package org.fco.streamapi.desafio;


import java.util.Arrays;
import java.util.List;

/*
Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.
 */
public class Desafo9 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> numerosDistintos = numeros.stream()
                .distinct()
                .toList();

        System.out.println(numerosDistintos.size());

        if(numerosDistintos.size() != numeros.size()) {
            System.out.println("A lista possui valores que se repetem...\n\n");
        }else {
            System.out.println("A lista não possui valores que se repetem...\n\n");
            System.out.println(numerosDistintos);
        }


    }
}
