package Stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Map<Boolean, List<Integer>> grupos = numeros.stream()
            .collect(Collectors.groupingBy(n -> n % 2 != 0 && (n % 3 == 0 || n % 5 == 0)));

        System.out.println("Números multiplos de 3 e 5: " + grupos.get(true));
    }
}
