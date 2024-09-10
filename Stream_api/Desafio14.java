package Stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio14 {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true;
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        }
        Integer maiorPrimo = numeros.stream()
            .filter(num -> isPrime(num))
            .max(Integer::compareTo)
            .orElse(null);
        System.out.println("Maior primo: " + maiorPrimo);
    }
}
