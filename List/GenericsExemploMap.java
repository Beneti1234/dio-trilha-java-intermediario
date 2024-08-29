import java.util.HashMap;
import java.util.Map;

public class GenericsExemploMap {
    public static void main(String[] args) {
        Map mapaSemGenerics = new HashMap();
        mapaSemGenerics.put("chave 1", 10);
        mapaSemGenerics.put("chave 2", "valor");

        Map<String, Integer> mapaGenerics = new HashMap<>();
        mapaGenerics.put("chave 1", 10);
        mapaGenerics.put("chave 2", 20);

        for (Map.Entry<String, Integer> entry : mapaGenerics.entrySet()) {
            String chave = entry.getKey();
            int valor = entry.getValue();
            System.out.println("Chave: " + chave + ", valor: " + valor);
        }

        for (Object obj : mapaSemGenerics.entrySet()) {
            Map.Entry entry = (Map.Entry) obj;
            String chave = (String) entry.getKey();
            Object valor = entry.getValue();
            
        }
    }
}