import java.util.Date;

public class Arrays {
    static void main(String[] args) {
        Integer [] array = new Integer[6];
        array[0] = 3;
        array[1] = 5;
        array[2] = 7;
        array[3] = 9;
        array[4] = 11;
        array[5] = 13;
        //outra sintaxe caso o array ja tenha valores definidos
        String[] nomes = {"ana", "Fernando", "Joao"};
        System.out.println(nomes[0]);


        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
