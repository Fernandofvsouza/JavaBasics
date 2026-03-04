public class Esferografica {
   public String modelo;
   public String cor;
   private float ponta = 0.5f;
   protected int carga;
   protected boolean tampada;

    public void status(){
        System.out.println("Modelo " + this.modelo);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tamapada? " + this.tampada);
        System.out.println("Carga " + this.carga);
    }

    public void rabiscar(){
        if(tampada){
            System.out.println("ERRO! Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando...");
        }
    }

    public float getPonta() {
        return ponta;
    }

    protected void tampar(){
        this.tampada = true;
    }

   protected void destampar(){
        this.tampada = false;
    }
}
