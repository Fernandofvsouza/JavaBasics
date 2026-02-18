/*
* Do while é uma estrutura de repetição bem parecido com while
* com a diferença que o do while executa o bloco de código pelo menos uma vez, mesmo que a condição seja falsa
* pois a condição é verificada somente após a execução do bloco de código
* */

//Sintaxe do do while
/*
do {
    // Bloco de código a ser executado
} while (condição);
*/

public class DoWhileTeorico {
    static void main(String[] args) {
        int contador = 0;
        do{
            System.out.println("Contador: " + contador);
            contador++;
        }while(contador < 5);


    }
}
