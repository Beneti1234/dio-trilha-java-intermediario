package Stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio19 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        int soma = numeros.stream()
            .filter(num -> num % 3 == 0 && num % 5 == 0)
            .reduce(0, Integer::sum);
        System.out.println("Soma dos divisíveis por 3 e 5: " + soma);
    }
}
