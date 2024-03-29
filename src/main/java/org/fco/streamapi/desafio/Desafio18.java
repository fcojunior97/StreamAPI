package org.fco.streamapi.desafio;

import java.util.Arrays;
import java.util.List;

/*
    Desafio 18 - Verifique se todos os números da lista são iguais:
    Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
 */
public class Desafio18 {

    public static void main(String[] args) {

        //List<Integer> numeros = Arrays.asList(99,2,35,39,88,40,24,77,19,100,95,12,74,46,93,2,4,90,86,14,90,38,34,70,16,48,65,92,
          //      57,74,71,66,15,60,29,50,67,45,78,23,9,43,54,46,56,13,1,75,66,19,85);

        List<Integer> numeros = Arrays.asList(99,99,99,99);

        boolean iguais = numeros.stream()
                .allMatch(numero -> numeros.getFirst().equals(numero));


        if(iguais) {
            System.out.println("Todos os numeros da lista são iguais");
        }else{
            System.out.println("Todos os numeros da lista são diferentes");
        }

    }
}
