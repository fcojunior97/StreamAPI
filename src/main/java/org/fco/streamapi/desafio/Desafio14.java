package org.fco.streamapi.desafio;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

/*
    Desafio 14 - Encontre o maior número primo da lista:
    Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.

 */
public class Desafio14 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 61, 7, 8, 9, 10, 5, 4, 3);
        //List<Integer> numeros = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73);

        Optional<Integer> num = numeros.stream()
                .filter(numero -> numero%1==0 && numero%numero==0)
                .max(Integer::compare);

        List<Integer> numerosPrimos = numeros.stream()
                .filter(numero -> numero%1==0 && numero%numero==0)
                .toList();

        if(!num.isEmpty()) {
            System.out.println("Os numeros primos da lista: " + numerosPrimos);
            System.out.println("O maior numero primo da lista é: " + num.get());
        }else{
            System.out.println("Não há numero máximo primo na lista");
        }

    }
}
