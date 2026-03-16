import java.time.LocalDate;

public class ExpressoesAvancadas {
    static void main(String[] args) {
        String nome = "Fernando V. de Souza";
        Integer matricula = 123;
        Double salario = 2350.00;
        LocalDate dataAdmissao = LocalDate.now();

        //Supondo que para o funcionario a empresa determinou que temos que formatar com digito a esquerda
        String zeroEsquerda = String.format("Matricula: %05d - Nome: %s - Salario: %,.2f", matricula, nome, salario);
        System.out.println(zeroEsquerda);

        //Supondo que como os nomes podem variar, vamos determinar um tamanho maximo de 30 caracteres para o nome e vamos alinhar a esquerda o nome
        String nomeMinMax = String.format("Matricula: %05d - Nome: %-30s - Salario: %,.2f", matricula, nome, salario);
        System.out.println(nomeMinMax);

        //Supondo que se o nome ultrapassar uma quantidade de caracteres que seja cortado
        String nomeCortado = String.format("Matricula: %05d - Nome: %-15.15s - Salario: %,.2f", matricula, nome, salario);
        System.out.println(nomeCortado);

        //Formatando datas
        String dataEmpresa = String.format("Dia: %td",  dataAdmissao);
        String dataMesEmpresa = String.format("Data e mes: %td/%<tm", dataAdmissao);
        String dataCompleta = String.format("Data Completa: %td/%<tm/%<ty", dataAdmissao);
        System.out.println(dataEmpresa);
        System.out.println(dataMesEmpresa);
        System.out.println(dataCompleta);




    }
}
