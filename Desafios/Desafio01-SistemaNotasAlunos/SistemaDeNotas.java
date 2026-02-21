/*
* Mini projeto: Sistema de Notas dos Alunos
* 1-Mostre um menu interativo
* 2-Permita ao usuário cadastrar alunos e suas notas usando um loop for
* 3-Calcule a media das notas, e mostre se o aluno foi aprovado ou reprovado (considerando a média de 6.0 como aprovação)
* 4-Mostrem a maior e a menor nota entre os alunos cadastrados
* 5- permita sair do programa
*
*
*
* */


import java.util.Scanner;

public class SistemaDeNotas {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;
        Services service = new Services();
        AlunoNota aluno = new AlunoNota();
        System.out.println("Bem-vindo ao Sistema de Notas dos Alunos!");
        System.out.println("Digite o nome do aluno: ");
        String nome = input.nextLine();
        aluno.setNome(nome);
        System.out.println("Digite a nota de Matemática(0-10): ");
        double notaMatematica = input.nextDouble();
        aluno.setNotaMatematica(notaMatematica);
        System.out.println("Digite a nota de Português(0-10): ");
        double notaPortugues = input.nextDouble();
        aluno.setNotaPortugues(notaPortugues);
        System.out.println("Digite a nota de Ciências(0-10): ");
        double notaCiencias = input.nextDouble();
        aluno.setNotaCiencias(notaCiencias);
        System.out.println("Digite a nota de Física(0-10): ");
        double notaFisica = input.nextDouble();
        aluno.setNotaFisica(notaFisica);

        do{
            System.out.println("Menu:");
            System.out.println("1 - Calcular média e situação do aluno");
            System.out.println("2 - Mostrar maior e menor nota");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch(opcao){
                case 1:
                    service.calcularMedia(aluno);
                    break;
                case 2:
                    service.mostrarMaiorMenorNota(aluno);
                    break;
                case 0:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");

            }


        }while(opcao != 0);


    }

}
