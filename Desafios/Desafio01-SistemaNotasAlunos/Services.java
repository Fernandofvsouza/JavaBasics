public class Services{
    public void calcularMedia(AlunoNota aluno){
        double media = (aluno.getNotaMatematica() + aluno.getNotaPortugues() + aluno.getNotaCiencias() + aluno.getNotaFisica()) / 4;

        System.out.printf("Media do aluno %s: %.1f%n", aluno.getNome(), media);
        if(media >= 6){
            System.out.println("O aluno " + aluno.getNome() + " foi aprovado!");
        }else if(media < 6 && media >= 4){
            System.out.println("O aluno " + aluno.getNome() + " está de recuperação!");
        }else if(media < 4 && media >= 0){
            System.out.println("O aluno " + aluno.getNome() + " foi reprovado!");
        }else{
            System.out.println("Nota inválida. A média deve ser entre 0 e 10.");
        }

    }

    public void mostrarMaiorMenorNota(AlunoNota aluno){
        double maiorNota = Math.max(Math.max(aluno.getNotaMatematica(), aluno.getNotaPortugues()), Math.max(aluno.getNotaCiencias(), aluno.getNotaFisica()));
        double menorNota = Math.min(Math.min(aluno.getNotaMatematica(), aluno.getNotaPortugues()), Math.min(aluno.getNotaCiencias(), aluno.getNotaFisica()));


        System.out.printf("Maior nota do aluno %s: %.1f%n", aluno.getNome(), maiorNota );
        System.out.printf("Menor nota do aluno %s: %.1f%n", aluno.getNome(), menorNota);
    }


}
