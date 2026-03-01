public class Molho {
    String nome;
    String sabor;
    String[] ingredientes = new String[3];
    double quantidade;
    boolean tampar;

    void status(){
        System.out.println("Nome " + this.nome);
        System.out.println("Sabor " + this.sabor);
        System.out.println("Ingredientes " + this.ingredientes[0] + ", " + this.ingredientes[1] + ", " + this.ingredientes[2]);
        System.out.println("Quantidade " + this.quantidade);
        System.out.println("Está tamapado? " + this.tampar);
    }

    void preparar(){
        if(tampar){
            System.out.println("ERRO! Não posso preparar o molho");
        } else {
            System.out.println("Estou preparando o molho...");
        }
    }

    void tampar(){
        this.tampar = true;
    }
}
