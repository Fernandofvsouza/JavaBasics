import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Generics {
    static void main(String[] args) {
        //Quando nao utilizamos generics podemos armazenar itens de qualquer tipo ex:
        List prateleira = new ArrayList();
        prateleira.add("Carrinho");
        prateleira.add(2);
        prateleira.add(true);
        for (Object o : prateleira) {
            System.out.println(o);
        }

        //Quando queremos armazenar elementos de apenas um tipo utilizamos os generics
        List <String> prateleiras = new ArrayList();
        prateleiras.add("carrinho");
        prateleiras.add("livro");
        prateleiras.add("boneca");
        for(String brinquedos : prateleiras) {
            System.out.println(brinquedos);
        }
        //Quando temos uma lista de um tipo especifico podemos classificar os itens por ordem natural
        Collections.sort(prateleiras);
        for(String brinquedos : prateleiras) {
            System.out.println(brinquedos);
        }
        //podemos colocar em ordem sortida os elementos
        Collections.shuffle(prateleiras);
        for(String brinquedos : prateleiras) {
            System.out.println(brinquedos);
        }
    }
}
