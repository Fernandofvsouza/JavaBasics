import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Mapa {
    static void main(String[] args) {
        Map<String, String> estados = new HashMap();
        estados.put("PI", "Piauí");
        estados.put("MG", "Minas Gerais");
        estados.put("DF", "Distrito Federal");
        estados.put("GO", "Goias");
        estados.put("RN", "Rio Grande do Norte");
        estados.put("RJ", "Rio de Janeiro");
        Iterator keys = estados.keySet().iterator();
        while(keys.hasNext()) {
            String chave = keys.next().toString();
            String valor = estados.get(chave);
            System.out.println("O estado é " + valor );
            System.out.println("O estado tem a sigla " + chave);
        }
    }
}
