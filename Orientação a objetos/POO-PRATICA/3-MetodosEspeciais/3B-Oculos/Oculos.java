public class Oculos {
    private String modelo;
    private String cor;
    private double preco;

    public Oculos(String modelo, String cor, double preco) {
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco, double desconto) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String desconto(){
        if(preco > 100){
            preco = preco - (preco * 0.10);
            return "Desconto de 10% aplicado!";

        } else {
            preco = preco - (preco * 0.05);
            return "Desconto de 5% aplicado!";
        }
    }
}
