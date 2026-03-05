public class Main {
    static void main(String[] args) {
        Canetinha c1 = new Canetinha();
        c1.setModelo("Bic Cristal");
        c1.setCor("Azul");
        c1.setPonta(0.5f);
        c1.setTampada(false);

        System.out.println(c1.getModelo());
        System.out.println(c1.getCor());
        System.out.println(c1.getPonta());
        System.out.println(c1.toString());
        System.out.println(c1.rabiscar());
    }
}
