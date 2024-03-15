package org.fco.streamapi.desafio;

/*
    Desafio 6 - Verificar se a lista contém algum número maior que 10:
    Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
*/

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio6 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11, 12, 5, 4, 3);

        Optional<Integer> numero = numeros.stream()
                .filter(num -> num > 10)
                .findFirst();

        if(!numero.isEmpty())
            System.out.println("Primeiro numero encontrado maior que " + numero.get());
        else{
            System.out.println("Não foi encontrado nenhum numero maior que 10 na lista");
        }


    }
}
