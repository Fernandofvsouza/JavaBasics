/*
* //Exercicio 1 - Menu simples que repete ate o usuario escolher sair
* //Exercicio 2 - Validação de senha ate o usuario acertar
* //Exercicio 3 - jogo de advinhação ate o usuario acertar o numero sorteado
* //Exercicio 4 - contagem decrescente com o numero escolhido pelo usuario, repetindo ate chegar a zero
* //Mini desafio: sistema que so aceita idade entre 18 e 60 anos, repetindo ate o usuario digitar uma idade valida
*
* */


import java.util.Random;
import java.util.Scanner;
public class DoWhilePratico {
    static void main(String[] args) {
        //Exercicio 1 - Menu simples que repete ate o usuario escolher sair
        Scanner input = new Scanner(System.in);
        int opcao;
        do{
            System.out.println("Menu:");
            System.out.println("1 - Pastel de frango");
            System.out.println("2 - Pastel de queijo");
            System.out.println("3 - Pastel de carne");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = input.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Voce escolheu pastel de frango");
                    break;
                case 2:
                    System.out.println("Voce escolheu pastel de queijo");
                    break;
                case 3:
                    System.out.println("Voce escolheu pastel de carne");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida, tente novamente.");
            }
        }while(opcao != 0);

        //Exercicio 2 - Validação de senha ate o usuario acertar
        String senhaDoUsuario = "12345";
        String tentativaSenha;
        do {
            System.out.println("Digite a senha: ");
            tentativaSenha = input.next();
            if (tentativaSenha.equals(senhaDoUsuario)) {
                System.out.println("Entrada validada, acesso concedido.");
            } else {
                System.out.println("Senha incorreta, tente novamente.");
            }
            }while (!tentativaSenha.equals(senhaDoUsuario)) ;

        //Exercicio 3 - jogo de advinhação ate o usuario acertar o numero sorteado
        Random random = new Random();
        int numero = random.nextInt(11); // numero entre 0 e 10
        int tentativa;
        int contadorTentativas = 0;
        do{
            System.out.println("Adivinhe o numero entre 0 e 10: ");
            tentativa = input.nextInt();
            if(tentativa == numero){
                System.out.println("Parabens, voce acertou!");
                System.out.println("O numero sorteado era: " + numero);
            }else{
                System.out.println("Numero incorreto, tente novamente.");
                contadorTentativas++;
                System.out.println("Numero de tentativas: " + contadorTentativas);
            }
        }while(tentativa != numero);

        //Exercicio 4 - contagem decrescente com o numero escolhido pelo usuario, repetindo ate chegar a zero
        int numeroContagem;
        System.out.println("Digite um numero para contagem decrescente: ");
        numeroContagem = input.nextInt();
        do{
            System.out.println("Contagem decrescente: " + numeroContagem);
            numeroContagem--;

        }while(numeroContagem > -1);

        //Mini desafio: sistema que so aceita idade entre 18 e 60 anos, repetindo ate o usuario digitar uma idade valida
        int idade;
        int opcaoIdade;
        do{
            System.out.println("Digite sua idade: ");
            idade = input.nextInt();
            if(idade >= 18 && idade <= 60){
                System.out.println("Idade valida, acesso concedido.");
                opcaoIdade = 0;
            }else{
                System.out.println("Idade invalida, tente novamente.");
                opcaoIdade = 1;
            }

        }while(opcaoIdade != 0);
    }


}
