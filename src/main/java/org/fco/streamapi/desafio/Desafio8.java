package org.fco.streamapi.desafio;


import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.List;

/*
    Desafio 8 - Somar os dígitos de todos os números da lista:
    Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
*/
public class Desafio8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDigitos = numeros.stream()
                .mapToInt(Desafio8::somaDigitos)
                .sum();

        System.out.println("A soma dos dígitos de todos os números da lista é: " + somaDigitos);
    }

    public static int somaDigitos(Integer numero) {
        int soma = 0;
        while (numero != 0) {
            soma += numero % 10;
            numero /= 10;
        }
        return soma;
    }
}



