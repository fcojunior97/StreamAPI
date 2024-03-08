package org.fco.streamapi.fco;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 *  Representa uma função que aceita argumento do tipo T e retorna um resultado do tipo R.
 *  É utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos.
 **/

public class FunctionExample {

    public static void main(String[] args) {

        // cria uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);


        // cria uma function interface para dobrar todos os numeros da lista, utilizando expressoes lambda.
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        // Utilizando a function para dobrar todos os numeros da lista e armazena-los em outra lista.
        List<Integer> numerosDobrados = numeros
                .stream()
                .map(dobrar)
                .toList();

        System.out.println(numerosDobrados);

        System.out.println("Utilizando a function para dobrar todos os numeros da lista e armazena-los em outra lista (utilizando a functional interface " +
                "diretamente).");

        // Utilizando a function para dobrar todos os numeros da lista e armazena-los em outra lista.
        List<Integer> numerosDobrados2 = numeros
                .stream()
                .map(num -> num * 2)
                .toList();

        System.out.println(numerosDobrados2);







    }


}
