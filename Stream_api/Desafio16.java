package Stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio16 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Map<Boolean, List<Integer>> grupos = numeros.stream()
            .collect(Collectors.partitioningBy(num -> num % 2 == 0));
    System.out.println("Pares: " + grupos.get(true));
    System.out.println("Ímpares: " + grupos.get(false));
    }
}
