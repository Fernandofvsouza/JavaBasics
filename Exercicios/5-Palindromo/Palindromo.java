import java.util.Scanner;

public class Palindromo {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma palavra ou frase para verificar se é um palíndromo: ");
        String texto = input.nextLine();
        String textoMinusculo = texto.toLowerCase();
        String textoAoContrario = new StringBuilder(textoMinusculo).reverse().toString();
        if(textoMinusculo.equals(textoAoContrario)){
            System.out.println("A palavra ou frase é um palíndromo!");
        }else{
            System.out.println("A palavra ou frase não é um palíndromo.");
        }
    }
}
