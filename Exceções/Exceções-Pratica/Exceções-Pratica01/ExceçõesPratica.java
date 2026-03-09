import java.text.NumberFormat;
import java.text.ParseException;

public class ExceçõesPratica {
    static void main(String[] args) {
        try{
            Double valor = (double) (100 / 0);
            System.out.println(valor);
        } catch (Exception e) {
            System.out.println("Catch bloco");
            e.printStackTrace();
        }finally {
            System.out.println("Finally bloco");
        }

        // Exemplo de um metodo que lança uma exceção, nesse caso a NumberFormatException, e como tratar ela usando o try catch
        try{
            Number valor = NumberFormat.getCompactNumberInstance().parse("a175");
            System.out.println(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
