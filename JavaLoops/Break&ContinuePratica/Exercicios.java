/*
* Exercicio 1: parar quando encontrar um numero especifico
* Exercicio 2 : ignorar numeros pares
* Exercicio 3 : Buscar um elemento em um array
* Exercicio  4: simular um caixa eletronico (parar ao saldo 0)
*
*
* */


import java.util.Scanner;

public class Exercicios {
    static void main(String[] args) {
       //Exercicio 01: parar quando encontrar um numero especifico
        Scanner input = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero (0a100): ");
        numero = input.nextInt();
        for(int i = 0;i <= 100; i++){
            if(i == numero){
                break;
            }
            System.out.println(i);
        }

        //Exercicio 02: ignorar numeros pares
        for(int i = 0; i <= 10; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }

        //Exercicio 3 buscar um elemento em um array
        String[] nomes = new String[]{"fernando", "joão", "leticya", "lola", "cleriton"};
        for(int i = 0; i < nomes.length; i++){
            if(nomes[i].equals("leticya")){
                System.out.println(nomes[i]);
            }
        }

        //Exercicio 4: simular um caixa eletronico
        double saldo = 100.00;
        double valorSaque;
        for(int i = 0; i <= saldo; i++){
            System.out.println("O seu saldo é de " + saldo);
            System.out.println("Qual o valor que voce deseja sacar? ");
            valorSaque = input.nextDouble();
            if(valorSaque <= saldo){
                System.out.println("Dinheiro Sacado com sucesso");
                saldo = saldo - valorSaque;
                System.out.println("O seu saldo é: " + saldo);
                break;

            }else{
                System.out.println("Saldo insuficiente");

            }
        }


    }
}
