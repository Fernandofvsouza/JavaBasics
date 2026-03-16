public class ExpressoesSimples {
    static void main(String[] args) {
        String nome = "Fernando Souza";
        Integer idade = 18;
        double salario = 1200.00;

        String dadosFuncionario = String.format("Funcionario %s com a idade %d e o salario %,.2f", nome, idade, salario);
        System.out.println(dadosFuncionario);
    }
}
