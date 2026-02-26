public class Carrinho {
    private Comida comida;
    private int quantidade= 0;
    private Bebida bebida;
    private int quantidadeBebida = 0;
    private Sobremesa sobremesa;
    private int quantidadeSobremesa = 0;

    public Carrinho(Comida comida, int quantidade, Bebida bebida, int quantidadeBebida, Sobremesa sobremesa, int quantidadeSobremesa) {
        this.comida = comida;
        this.quantidade = quantidade;
        this.bebida = bebida;
        this.quantidadeBebida = quantidadeBebida;
        this.sobremesa = sobremesa;
        this.quantidadeSobremesa = quantidadeSobremesa;
    }

    public Comida getComida() {
        return comida;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Bebida getBebida() {
            return bebida;
    }

    public int getQuantidadeBebida() {
        return quantidadeBebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public void setQuantidadeBebida(int quantidadeBebida) {
        this.quantidadeBebida = quantidadeBebida;
    }

    public Sobremesa getSobremesa() {
        return sobremesa;
    }

    public int getQuantidadeSobremesa() {
        return quantidadeSobremesa;
    }

    public void setSobremesa(Sobremesa sobremesa) {
        this.sobremesa = sobremesa;
    }

    public void setQuantidadeSobremesa(int quantidadeSobremesa) {
        this.quantidadeSobremesa = quantidadeSobremesa;
    }
}
