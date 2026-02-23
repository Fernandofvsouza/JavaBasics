import java.util.Scanner;

public class BuscarNumero {
    public static void main(String[] args) {
        //Peça um número ao usuario e diga se ele existe em um vetor
        int[] vetor = {1, 2, 3, 4, 5};
        boolean existe = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para buscar no vetor:");
        int numero = scanner.nextInt();
        for(int v : vetor){
            if(v == numero){
                existe = true;
                break;
            }
        }
        if(existe){
            System.out.println("O número " + numero + " existe no vetor.");
        } else {
            System.out.println("O número " + numero + " não existe no vetor.");
        }
    }
}
