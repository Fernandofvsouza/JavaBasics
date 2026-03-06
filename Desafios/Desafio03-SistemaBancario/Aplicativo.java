import java.util.Scanner;

public class Aplicativo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Banco banco = new Banco();
        int opcao;

        do{
            System.out.println("Menu:");
            System.out.println("1. Criar conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Exibir dados de uma conta");
            System.out.println("6. Listar contas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine();

            switch(opcao){
                case 1:
                    banco.criarConta();
                    break;
                case 2:
                    System.out.println("Escolha a conta para depositar:");
                    Conta contaDeposito = banco.selecionarConta();
                    if(contaDeposito != null){
                        System.out.print("Digite o valor a ser depositado: ");
                        double valorDeposito = input.nextDouble();
                        contaDeposito.depositar(valorDeposito);
                    }else{
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                case 3:
                    System.out.println("Escolha a conta para sacar:");
                    Conta contaSaque = banco.selecionarConta();
                    if(contaSaque != null){
                        System.out.print("Digite o valor a ser sacado: ");
                        double valorSaque = input.nextDouble();
                        contaSaque.sacar(valorSaque);
                    }else{
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                case 4:
                    System.out.println("Escolha a conta para consultar o saldo:");
                    Conta contaConsulta = banco.selecionarConta();
                    if(contaConsulta != null){
                        contaConsulta.consultarSaldo();
                    }else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                case 5:
                    System.out.println("Escolha a conta para exibir os dados:");
                    Conta contaDados = banco.selecionarConta();
                    if(contaDados != null){
                        contaDados.exibirDados();
                    }else {
                        System.out.println("Conta não encontrada.");}
                    break;
                case 6:
                    banco.listarContas();
                    break;
                case 0:
                    System.out.println("Encerrando o aplicativo. Obrigado por usar nosso sistema bancário!");
                    break;
            }
        }while(opcao != 0);
    }
}
