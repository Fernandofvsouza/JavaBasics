public class Bebida {
    String nomeBebida;
    double precoBebida;

    public Bebida(String nomeBebida, double precoBebida) {
        this.nomeBebida = nomeBebida;
        this.precoBebida = precoBebida;
    }

    public String getNomeBebida() {
        return nomeBebida;
    }

    public double getPrecoBebida() {
        return precoBebida;
    }
}
