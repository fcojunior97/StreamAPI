package org.fco.streamapi.desafio;


/*
    Desafio 2 - Imprima a soma dos números pares da lista:

    Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
 */


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio2 {

    public static void main(String[] args) {

        //List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numeros = Arrays.asList(1, 3, 9);

        Optional<Integer> somaDosNumerosPares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .reduce((num1, num2) -> num1 + num2);

        if(!somaDosNumerosPares.isEmpty()) {
            System.out.println("A soma dos numeros pares da lista é: "+ somaDosNumerosPares.get());
        }else{
            System.out.println("Não há numeros pares na lista");
        }



    }

}
