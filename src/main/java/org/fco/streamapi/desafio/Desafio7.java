package org.fco.streamapi.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
    Desafio 7 - Encontrar o segundo número maior da lista
    Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
*/

public class Desafio7 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 61, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> maiorNum = numeros.stream()
                .max(Integer::compareTo);

        if(!maiorNum.isEmpty()) {
            System.out.println("O maior número da lista é: " + maiorNum.get());
        }else {
            System.out.println("Não há um número maior na lista");
        }


    }
}
