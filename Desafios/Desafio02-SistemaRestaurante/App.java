import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("Bem-vindo ao Restaurante Coma Bem!");
            System.out.println("1. Adicionar prato ao carrinho");
            System.out.println("2. Adicionar bebida ao carrinho");
            System.out.println("3. Adicionar sobremesa ao carrinho");
            System.out.println("4. Finalizar pedido");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch(opcao){
                case 1:
                    Service.adicionarPrato();
                    break;
                case 2:
                    Service.adicionarBebida();
                    break;
                case 3:
                    Service.adicionarSobremesa();
                    break;
                case 4:
                    Service.finalizarPedido();
                    break;
                case 0:
                    System.out.println("Obrigado por visitar o Restaurante Coma Bem! Volte sempre!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }while(opcao != 0);

    }


}
