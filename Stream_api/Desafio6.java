package Stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        boolean maisQueDez = numeros.stream()
            .anyMatch(n -> n > 10);
        
        System.out.println("Tem número maior do que 10? " + maisQueDez);
    }
}
