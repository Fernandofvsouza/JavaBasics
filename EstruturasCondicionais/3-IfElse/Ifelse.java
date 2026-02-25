/*O if e else é uma estrutura condicional, que permite executar um bloco de código se uma condição for verdadeira, e outro bloco de código se a condição for falsa. A sintaxe básica do if e else é a seguinte:
if (condição) {
    // bloco de código a ser executado se a condição for verdadeira
} else {
    // bloco de código a ser executado se a condição for falsa
}
*
*
*
* */




public class Ifelse {
    static void main(String[] args) {
        int idade = 19;
        int idadeMinima = 18;
        int idadeMaxima = 65;

        if(idade >= idadeMinima && idade <= idadeMaxima) {
            System.out.println("Você pode dirigir");
        } else if(idade < idadeMinima) {
            System.out.println("Você é muito jovem para dirigir");
        } else {
            System.out.println("Você não pode dirigir");
        }

    }
}
