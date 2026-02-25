/*
* Uma expressão condicional ternária é uma forma concisa de escrever uma expressão condicional simples. Ela é composta por três partes: a condição, o valor a ser retornado se a condição for verdadeira e o valor a ser retornado se a condição for falsa. A sintaxe geral é a seguinte:
* * condição ? valor_se_verdadeiro : valor_se_falso
* */


import java.util.Scanner;

public class ExpressaoTernaria {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual é a sua idade?");
        int idade = input.nextInt();
        String mensagem = idade >= 18 ? "Você é maior de idade." : "Você é menor de idade.";
        System.out.println(mensagem);
    }
}
