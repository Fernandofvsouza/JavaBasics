//Exercicio 01:Imrpimir numero de 1 a 10
//Exercicio 02: imprimir numeros pares de 1 a 20
//Exercicio 03: Somar e imprimir numeros de 1 a 100
//Desafio: Pedir um numero ao usuario e imprimir a tabuada desse numero


import java.util.Scanner;

public class WhilePratico {
    static void main(String[] args) {
        //Exercicio 01:
        int i = 1;
        while(i <= 10){
            System.out.println("Numero: " + i);
            i++;
        }

        //Exercicio 02:
        int n = 0;
        while(n <= 20){
            System.out.println("Numero par: " + n);
            n+=2;

        }

        //Exercicio 03:
        int sum = 0;
        int num = 1;
        while(num <= 100){
            sum = sum + num;
            System.out.println("Numero: " + num + " Soma: " + sum);
            num++;
        }

        //Desafio:
        Scanner input = new Scanner(System.in);
        int number;
        int mult = 0;
        System.out.println("Digite um numero para ver a tabuada: ");
        number = input.nextInt();
        while(mult <= 10){
            System.out.println("Numero: " + number + " x " + "Multiplicador: " + mult + " = " + (number * mult) );
            mult++;
        }
    }

}
