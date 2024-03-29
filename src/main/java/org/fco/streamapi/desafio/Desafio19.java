package org.fco.streamapi.desafio;

/*
   Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
   Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio19 {

    public static void main(String[] args) {


//        List<Integer> numeros = Arrays.asList(99,2,35,39,88,40,24,77,19,100,95,12,74,46,93,2,4,90,86,14,90,38,34,70,16,48,65,92,
//              57,74,71,66,15,60,29,50,67,45,78,23,9,43,54,46,56,13,1,75,66,19,85);

//        List<Integer> numeros = Arrays.asList(1,3,30,8,15,22,60);
        List<Integer> numeros = Arrays.asList(1,3,8,22);

        Optional<Integer> soma = numeros.stream()
                .filter(numero -> numero%3==0 & numero%5==0)
                .reduce((num1, num2) -> num1 + num2);

        if (soma.isPresent()) {
            System.out.println("A soma dos numeros divisiveis tanto por 3 quanto por 5 é igual a: " + soma.get());
        }else {
            System.out.println("Não há numeros divisiveis por 3 e por 5");
        }

    }
}
