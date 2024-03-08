package org.fco.streamapi.desafio;


/*
    Desafio 5 - Calcule a média dos números maiores que 5:
    Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio5 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> somaDosValoresMaioresQueCinco = numeros.stream()
                .filter(numero -> numero > 5)
                .reduce((num1, num2) -> num1 + num2);

        //if()





    }
}
