package org.fco.streamapi.fco;


import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *  Representa uma operação que não aceita nenhum argumento  e  retorna um resultado do tipo T.
 *  É comumente usada para criar ou fornecer novos objetos de um determinado tipo
 **/

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<String> saudacao = () -> "Olá Mundo!";

        // usa o supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream
                .generate(saudacao)
                .limit(3)
                .toList();

        // imprimir as saudações geradas
        listaSaudacoes.forEach(System.out::println);





    }
}
