import java.util.Scanner;

import static java.lang.Long.MAX_VALUE;

public class MaioresMenores {
    public static void main(String[] args) {
        //Crie um array com 10 numeros e mostre os 3 maiores e os 3 menores numeros do array
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] maiores = new int[3];
        int[] menores = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " + (i+1) +  " numero:" +
                    " ");
           numeros[i] = input.nextInt();}

        for(int i = 0; i < numeros.length; i++){
           if(numeros[i] > maiores[0]){
                maiores[2] = maiores[1];
                maiores[1] = maiores[0];
                maiores[0] = numeros[i];
              } else if(numeros[i] > maiores[1]){
                maiores[2] = maiores[1];
                maiores[1] = numeros[i];
              } else if(numeros[i] > maiores[2]){
                maiores[2] = numeros[i];


           } if(numeros[i] < menores[0]){
                menores[2] = menores[1];
                menores[1] = menores[0];
                menores[0] = numeros[i];
              } else if(numeros[i] < menores[1]){
                menores[2] = menores[1];
                menores[1] = numeros[i];
              } else if(numeros[i] < menores[2]){
                menores[2] = numeros[i];
              }
            }

        System.out.println("Os 3 maiores numeros são: " + maiores[0] + ", " + maiores[1] + ", " + maiores[2]);
        System.out.println("Os 3 menores numeros são: " + menores[0] + ", " + menores[1] + ", " + menores[2]);
    }

}


