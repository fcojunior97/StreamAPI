package org.fco.streamapi.fco;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *  Representa uma função que aceita argumento do tipo T e retorna um valor booleano.
 *  É comumente utilizada para filtrar os elementos de uma lista/stream com base em alguma condição.
 **/

public class PredicateExample {

    public static void main(String[] args) {

        // cria uma lista com nomes de linguagens
        List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "JavaScript", "C", "Go", "Ruby");


        // Cria um predicate que retorna todas as Strings que possuem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        palavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(System.out::println);
    }





}
