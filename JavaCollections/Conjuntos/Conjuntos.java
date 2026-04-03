import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Conjuntos {
    static void main(String[] args) {
        //HashSet ira organizar os itens atraves do algoritmo HashMap
        Set linguagens = new HashSet();
        linguagens.add("Python");
        linguagens.add("Java");
        linguagens.add("C++");
        linguagens.add("Go");
        linguagens.add("Python");//Não é permitido elementos duplicados, ou seja, ele não irá adicionar o elemento "Python" novamente
        linguagens.add("JavaScript");
        System.out.println("O conjunto possui " + linguagens.size() + " elementos");
        for (Object linguagem : linguagens) {
            System.out.println(linguagem);
        }

        //LinkedHashSet mantem a organização dos itens como declaradas e caso haja elementos repetidos, ele manterá o primeiro e excluirá os outros
        Set linguagens2 = new LinkedHashSet();
        linguagens2.add("Python");
        linguagens2.add("Java");
        linguagens2.add("C++");
        linguagens2.add("Go");
        linguagens2.add("Python");
        linguagens2.add("JavaScript");
        System.out.println("O conjunto possui " + linguagens2.size() + " elementos");
        for (Object linguagem : linguagens2) {
            System.out.println(linguagem);
        }

        //TreeSet organiza os itens em ordem crescente, ou seja, ele irá organizar os itens de acordo com a ordem alfabética(Strings), e caso haja elementos repetidos, ele manterá o primeiro e excluirá os outros
        Set linguagens3 = new TreeSet();
        linguagens3.add("Python");
        linguagens3.add("Java");
        linguagens3.add("C++");
        linguagens3.add("Go");
        linguagens3.add("Python");
        linguagens3.add("JavaScript");
        System.out.println("O conjunto possui " + linguagens3.size() + " elementos");
        for (Object linguagem : linguagens3) {
            System.out.println(linguagem);
        }
    }
}
