package org.fco.streamapi.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
    Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
    Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.

 */
public class Desafio15 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(992,35,39,88,40,24,77,19,-100,95,12,74,46,93,2,4,90,86,14,90,38,34,70,16,48,65,92,
                57,74,71,66,15,60,29,50,67,45,78,23,9,43,54,46,56,13,1,75,66,19,85);

        Optional<Integer> numeroNegativo = numeros.stream()
                .filter(numero -> numero < 0)
                .findFirst();

        if(!numeroNegativo.isEmpty()) {
            System.out.println("A lista contém pelo menos 1 numero negativo: " + numeroNegativo.get());
        }else{
            System.out.println("A lista nao contém nenhum numero negativo");
        }

    }
}
