/*
* O comando break, quando utilizado dentro de um loop, tem a função de interromper a execução do loop imediatamente,
* fazendo com que o programa continue a execução a partir da próxima linha de código após o loop.
*  Ele é frequentemente usado para sair de um loop quando uma condição específica é atendida.
*
* O comando continue, por outro lado, é usado para pular a iteração atual do loop e passar para a próxima iteração.
*
*
* */



public class BreakContinue {
    static void main(String[] args) {
        int cont = 100;
        for(int i = 0 ; i < cont; i++) {
            if(i == 5){
                continue;
            }

            if(i >= 10){
                break;
            }
            System.out.println(i);


        }
    }

}
