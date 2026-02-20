/*
* Exercicio 01: imprimir um numero dado pelo usuario em decrescente ate 0
* Exercicio 02 tabuada completa de 1 a 10
* Exercicio 03: imprimir os numeros pares de 1 a 100
* Exercicio 04: somar os numeros pares
* Exercicio 05: Desenhar um triangulo com *
* */

import java.util.Scanner;

public class ForPratico {
    static void main(String[] args) {
        //Exercicio 01
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = input.nextInt();
        for(; numero >= 0; numero--){
            System.out.println(numero);
        }

        //Exercicio 02 tabuada completa de 1 a 10
        for(int i = 1; i <= 10; i++){
            System.out.println("Tabuada do " + i);
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }


        //Exercicio 03: imprimir os numeros pares de 1 a 100
       for(int i = 0; i <= 100; i+=2){
           System.out.println(i);
       }

         //Exercicio 04: somar os numeros pares
        int soma = 0;
       for(int i = 0; i <= 100; i+=2){
           soma += i;
       }
         System.out.println("A soma dos numeros pares de 1 a 100 é: " + soma);

            //Exercicio 05: Desenhar um triangulo com *
            for(int i = 1; i <= 5; i++){
                for(int j = 1; j <= i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
