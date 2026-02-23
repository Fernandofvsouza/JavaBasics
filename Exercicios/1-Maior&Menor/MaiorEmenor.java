import java.util.Scanner;

public class MaiorEmenor {
    static void main(String[] args) {
        //Crie um array com 10 numeros e mostre o maior e o menor numero do array
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[5];
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " + (i+1) +  " numero: ");
            numeros[i] = input.nextInt();
        }
        int maior = numeros[0];
        int menor = numeros[0];

        for(int i = 1; i < numeros.length; i++){
            if(numeros[i] > maior){
                maior = numeros[i];
            }
            if(numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("O maior numero é: " + maior);
        System.out.println("O menor numero é: " + menor);

    }
}
