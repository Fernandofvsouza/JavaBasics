import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    Scanner input = new Scanner(System.in);
    private ArrayList<Conta> contas = new ArrayList<>();
    private long contadorContas = 1;

    public void criarConta(){
        Conta novaConta = new Conta(null, 0, contadorContas++, 0);

        System.out.println("Digite o seu nome: ");
        novaConta.setNomeTitular(input.nextLine());

        System.out.println("Digite o seu CPF: ");
        novaConta.setCpf(input.nextLong());



        System.out.println("Digite o saldo inicial: ");
        novaConta.setSaldo(input.nextDouble());
        input.nextLine();

        contas.add(novaConta);
        System.out.println("Conta criada com sucesso!");
    }

    public Conta selecionarConta(){
        System.out.println("Digite o numero da conta: ");
        long numeroConta = input.nextLong();
        input.nextLine();

        for(Conta conta : contas){
            if(conta.getNumeroConta() == numeroConta){
                return conta;
            }
        }
        return null; // conta não encontrada
    }

    public void listarContas(){
        if(contas.isEmpty()){
            System.out.println("Nenhuma conta cadastrada.");
        }else{
            System.out.println("Contas cadastradas:");
            for(Conta conta : contas){
                System.out.println("Número da Conta: " + conta.getNumeroConta() + " - Titular: " + conta.getNomeTitular());
            }
        }
    }
}
