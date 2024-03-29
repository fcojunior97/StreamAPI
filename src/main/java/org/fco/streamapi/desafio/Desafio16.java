package org.fco.streamapi.desafio;


/*
    Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
    Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.

 */

import java.util.Arrays;
import java.util.List;

public class Desafio16 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(99,2,35,39,88,40,24,77,19,100,95,12,74,46,93,2,4,90,86,14,90,38,34,70,16,48,65,92,
                57,74,71,66,15,60,29,50,67,45,78,23,9,43,54,46,56,13,1,75,66,19,85);

        List<Integer> numerosPares = numeros.stream()
                .filter(numero -> numero%2==0)
                .toList();

        List<Integer> numerosImpares = numeros.stream()
                .filter(numero -> numero%2!=0)
                .toList();

        System.out.println("Lista com os numeros pares: " + numerosPares);
        System.out.println("Lista com os numeros impares:  " + numerosImpares);
    }
}
