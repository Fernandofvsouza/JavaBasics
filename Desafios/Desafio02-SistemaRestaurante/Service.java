import java.util.Scanner;

public class Service {
    // Carrinho compartilhado entre todos os métodos
    private static Carrinho carrinho = new Carrinho(null, 0, null, 0, null, 0);

    public static void adicionarPrato() {
        Scanner input = new Scanner(System.in);



        int opcao;
        do {
            System.out.println("Opcões de pratos:");
            System.out.println("1. Pizza - R$10.00");
            System.out.println("2. Hambúrguer - R$8.50");
            System.out.println("3. Salada - R$6.00");
            System.out.println("4. Sushi - R$12.00");
            System.out.println("5. Lasanha - R$9.00");
            System.out.println("6. Frango Frito - R$7.50");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Escolha um prato: ");
            opcao = input.nextInt();

            switch(opcao){
                case 1:
                    carrinho.setComida(new Comida("Pizza", 10.00));
                    System.out.println("Pizza adicionada ao carrinho!");

                    break;
                case 2:
                    carrinho.setComida(new Comida("Hambúrguer", 8.50));
                    System.out.println("Hambúrguer adicionado ao carrinho!");

                    break;
                case 3:
                    carrinho.setComida(new Comida("Salada", 6.00));
                    System.out.println("Salada adicionada ao carrinho!");

                    break;
                case 4:
                    carrinho.setComida(new Comida("Sushi", 12.00));
                    System.out.println("Sushi adicionado ao carrinho!");

                    break;
                case 5:
                    carrinho.setComida(new Comida("Lasanha", 9.00));
                    System.out.println("Lasanha adicionada ao carrinho!");
                    break;
                case 6:
                    carrinho.setComida(new Comida("Frango Frito", 7.50));
                    System.out.println("Frango Frito adicionado ao carrinho!");
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");

            }
        } while (opcao != 0);


    }
    public static void adicionarBebida() {
        Scanner input = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Opcões de bebidas:");
            System.out.println("1. Refrigerante - R$3.00");
            System.out.println("2. Suco Natural - R$4.50");
            System.out.println("3. Água Mineral - R$2.00");
            System.out.println("4. Cerveja - R$5.00");
            System.out.println("5. Vinho - R$15.00");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Escolha uma bebida: ");
            opcao = input.nextInt();

            switch(opcao){
                case 1:
                    carrinho.setBebida(new Bebida("Refrigerante", 3.00));
                    System.out.println("Refrigerante adicionado ao carrinho!");
                    break;
                case 2:
                    carrinho.setBebida(new Bebida("Suco Natural", 4.50));
                    System.out.println("Suco Natural adicionado ao carrinho!");
                    break;
                case 3:
                    carrinho.setBebida(new Bebida("Água Mineral", 2.00));
                    System.out.println("Água Mineral adicionada ao carrinho!");
                    break;
                case 4:
                    carrinho.setBebida(new Bebida("Cerveja", 5.00));
                    System.out.println("Cerveja adicionada ao carrinho!");
                    break;
                case 5:
                    carrinho.setBebida(new Bebida("Vinho", 15.00));
                    System.out.println("Vinho adicionado ao carrinho!");
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");

            }
        } while (opcao != 0);
    }
    public static void adicionarSobremesa() {
        Scanner input = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Opcões de sobremesas:");
            System.out.println("1. Sorvete - R$4.00");
            System.out.println("2. Bolo de Chocolate - R$5.50");
            System.out.println("3. Pudim - R$3.50");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Escolha uma sobremesa: ");
            opcao = input.nextInt();

            switch(opcao){
                case 1:
                    carrinho.setSobremesa(new Sobremesa("Sorvete", 4.00));
                    System.out.println("Sorvete adicionado ao carrinho!");
                    break;
                case 2:
                    carrinho.setSobremesa(new Sobremesa("Bolo de Chocolate", 5.50));
                    System.out.println("Bolo de Chocolate adicionado ao carrinho!");
                    break;
                case 3:
                    carrinho.setSobremesa(new Sobremesa("Pudim", 3.50));
                    System.out.println("Pudim adicionado ao carrinho!");
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");

            }
        } while (opcao != 0);
    }
    public static void finalizarPedido() {
        System.out.println("\n===== RESUMO DO PEDIDO =====");

        double total = 0;

        // Verifica se há comida no carrinho
        if (carrinho.getComida() != null) {
            System.out.println("Prato:     " + carrinho.getComida().getNomePrato()
                    + " - R$" + String.format("%.2f", carrinho.getComida().getPrecoPrato()));
            total += carrinho.getComida().getPrecoPrato();
        } else {
            System.out.println("Prato:     Nenhum");
        }

        // Verifica se há bebida no carrinho
        if (carrinho.getBebida() != null) {
            System.out.println("Bebida:    " + carrinho.getBebida().getNomeBebida()
                    + " - R$" + String.format("%.2f", carrinho.getBebida().getPrecoBebida()));
            total += carrinho.getBebida().getPrecoBebida();
        } else {
            System.out.println("Bebida:    Nenhuma");
        }

        // Verifica se há sobremesa no carrinho
        if (carrinho.getSobremesa() != null) {
            System.out.println("Sobremesa: " + carrinho.getSobremesa().getNomeSobremesa()
                    + " - R$" + String.format("%.2f", carrinho.getSobremesa().getPrecoSobremesa()));
            total += carrinho.getSobremesa().getPrecoSobremesa();
        } else {
            System.out.println("Sobremesa: Nenhuma");
        }

        System.out.println("============================");
        System.out.printf("TOTAL:     R$%.2f%n", total);
        System.out.println("============================");
        System.out.println("Pedido finalizado com sucesso! Bom apetite!");

        // Limpa o carrinho após finalizar
        carrinho = new Carrinho(null, 0, null, 0, null, 0);
    }
}
