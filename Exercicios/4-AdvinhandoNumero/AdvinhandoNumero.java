import java.util.Random;
import java.util.Scanner;

public class AdvinhandoNumero {
    static void main(String[] args) {
        Random random = new Random();
        int numeroSorteado = random.nextInt(100) + 1; // Gera um número entre 1 e 100
        int tentativas = 0;
        Scanner input = new Scanner(System.in);
        for(int i = 0; i <= 10; i++){
            System.out.println("Advinhe o numero entre 1 e 100 (Até 10 tentativas): ");
            int numero = input.nextInt();
            tentativas++;
            if(numero == numeroSorteado) {
                System.out.println("Parabéns! Você advinhou o número " + numeroSorteado + " em " + tentativas + " tentativas.");
                break;
            }else if (numero < numeroSorteado){
                System.out.println("O número é maior que " + numero);
                System.out.println("Você tem " + (10 - tentativas) + " tentativas restantes.");

            }else{
                System.out.println("O número é menor que " + numero);
                System.out.println("Você tem " + (10 - tentativas) + " tentativas restantes.");


            }
            if(tentativas == 10){
                System.out.println("Suas tentativas acabaram! O número sorteado era " + numeroSorteado);
                break;
            }

        }
    }
}
