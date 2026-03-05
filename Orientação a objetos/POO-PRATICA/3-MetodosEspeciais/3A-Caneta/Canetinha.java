public class Canetinha {
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;

    public void Canetinha(String modelo, String cor, float ponta, boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.tampada = true;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public String rabiscar() {
        if (this.tampada) {
            return "Não posso rabiscar";
        } else {
            return "Estou rabiscando";
        }
    }

    @Override
    public String toString() {
        return "Canetinha{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", ponta=" + ponta +
                ", tampada=" + tampada +
                '}';
    }
}
