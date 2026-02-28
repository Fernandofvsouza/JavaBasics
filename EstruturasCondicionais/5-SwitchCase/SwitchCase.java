/*
* O switch-case é uma estutura de controle de fluxo que permite executar diferentes blocos de código com base no valor de uma expressão. Ele é uma alternativa ao uso de múltiplos if-else quando temos várias condições a serem verificadas.
* pode ser uma alternativa ao if e else justamente em caso em que haja muitas condições a serem verificadas, pois o switch-case torna o código mais legível e organizado.
*
* A sintaxe do switch-case é a seguinte:
* switch (expressão) {
*    case valor1:
*       // bloco de código a ser executado se a expressão for igual a valor1
*      break;
* *    case valor2:
*      // bloco de código a ser executado se a expressão for igual a valor2
* *      break;
*   ...
*
*
* */




public class SwitchCase {
    static void main(String[] args) {
        int diaSemaana = 3;
        switch(diaSemaana){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia da semana inválido");
        }
    }
}
