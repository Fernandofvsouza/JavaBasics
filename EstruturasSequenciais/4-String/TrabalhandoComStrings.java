/*
O que é uma String?
Uma string em java é uma sequencia de caracteres.
Strings são usadas para armazenar e manipular texto.

Concatenando Strings
Usamos o operador + para concatenar strings, ou seja, juntar duas ou mais strings em uma única string.


Metodos da classe String
A classe String em Java possui diversos métodos para manipular strings, como:
- length(): Retorna o comprimento da string.
- toUpperCase(): Converte a string para maiúsculas.
- toLowerCase(): Converte a string para minúsculas.
- contains(): Verifica se a string contém uma determinada sequência de caracteres.
E etc... Existem muitos outros métodos disponíveis na classe String para realizar diversas operações com strings.

*/




public class TrabalhandoComStrings {
    static void main(String[] args) {
        String nome = "João";
        String sobrenome = "Silva";
        String nomeCompleto = nome + " " + sobrenome;

        System.out.println("Nome completo: " + nomeCompleto);



        //Alguns exemplos de metodos de String
        int comprimento = nomeCompleto.length();
        System.out.println("Comprimento do nome completo: " + comprimento);

        String nomeMaiusculo = nomeCompleto.toUpperCase();
        System.out.println("Nome completo em maiúsculas: " + nomeMaiusculo);

        String nomeMinusculo = nomeCompleto.toLowerCase();
        System.out.println("Nome completo em minúsculas: " + nomeMinusculo);

        boolean contemSilva = nomeCompleto.contains("Silva");
        System.out.println("O nome completo contém 'Silva'? " + contemSilva);
    }
}
