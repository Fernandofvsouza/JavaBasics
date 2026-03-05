public class Principal {
    static void main(String[] args) {
        Oculos oculos1 = new Oculos("Ray-Ban", "Preto", 150.00);
        System.out.println("Preço original: R$" + oculos1.getPreco());
        oculos1.setCor("Azul");
        System.out.println("Cor atualizada: " + oculos1.getCor());
        System.out.println(oculos1.desconto());
        System.out.println("Preço com desconto: R$" + oculos1.getPreco());

    }
}
