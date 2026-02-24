/*
* Saída de dados:
* - System.out.println(): Imprime uma linha de texto no console.
* - System.out.print(): Imprime um texto no console sem pular para a próxima linha
*  - System.out.printf(): Permite formatar a saída de dados, usando especificadores de formato.
*
* * Entrada de dados:
* Usamos a classe Scanner para ler dados do teclado
*
*
* */


import java.util.Scanner;

public class entradaEsaída {
    static void main(String[] args) {
    // Exemplo de saída de dados
    System.out.println("Olá, mundo!"); // Imprime uma linha de texto no console

    //Entrada de  dados
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine(); // Lê uma linha de texto do teclado e ar
        //Armazena na variável nome
        System.out.println("Olá, " + nome + "!"); // Imprime uma mensagem de saudação usando o nome fornecido

    }
}
