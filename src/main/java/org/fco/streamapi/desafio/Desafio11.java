package org.fco.streamapi.desafio;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
    Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
    Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
 */
public class Desafio11 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3); //1 + 4 + 9

        int somaDosQuadrados = numeros.stream()
                .mapToInt(n -> n * n)
                .sum();

        System.out.println(somaDosQuadrados);

    }
}
