public class InverterArray {
    static void main(String[] args) {
        //Crie um vetor e mostre ele invertido
        int[] vetor = {1, 2, 3, 4, 5};

        System.out.println("Vetor original:");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }

        System.out.println("Vetor invertido:");
        for(int i = vetor.length; i > 0; i--){
            System.out.println(vetor[i-1]);
        }

    }
}
