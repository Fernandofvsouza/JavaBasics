import java.util.ArrayList;
import java.util.List;

public class Listas {
    static void main(String[] args) {
        List linguagens = new ArrayList();//Uma grande diferença do array, é que não precisamos definir o tamanho do array, ou seja, ele é dinâmico, e pode crescer ou diminuir de acordo com a necessidade do programa.
        linguagens.add("Python");
        System.out.println("Comprimento atual: " + linguagens.size());
        linguagens.add("Java");
        linguagens.add("Go");
        linguagens.add("Javascript");
        linguagens.add("C");
        linguagens.remove("Python");
        linguagens.add(0,"Ruby");
        System.out.println("Comprimento atual: " + linguagens.size());
        System.out.println("A linguagem na posição 3: " + linguagens.get(2));
        System.out.println("A linguagem Java está na posição: " + linguagens.indexOf("Java"));//Caso não exista retorna -1
        System.out.println(linguagens.contains("Python"));//Retorna true ou false, caso exista ou não o elemento dentro da lista
        //Temos inumeros outros metodos dentro do framework

        for (Object linguagem : linguagens) {
            System.out.println(linguagem);
        }

    }
}
