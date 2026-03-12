import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);


        System.out.println("Informe os dados da conta");
        System.out.print("Número: ");
        int number = input.nextInt();
        System.out.println("Titular: ");
        input.nextLine();
        String holder = input.nextLine();
        System.out.println("Saldo inicial: ");
        double balance = input.nextDouble();
        System.out.println("Limite de saque: ");
        double withdrawLimit = input.nextDouble();

        Account account = new Account(number, holder, balance, withdrawLimit);

        System.out.println();
        System.out.println("Informe uma quantia para saque: ");
        double amount = input.nextDouble();

        try{
            account.withdraw(amount);
            System.out.println("Novo saldo: " + String.format("%.2f", account.getBalance()));
        }
        catch(RuntimeException e){
            System.out.println("Erro: " + e.getMessage());
        }


        input.close();


    }
}
