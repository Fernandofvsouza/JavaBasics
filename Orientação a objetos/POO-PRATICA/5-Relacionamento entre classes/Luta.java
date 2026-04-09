import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;


    public void marcarLuta(Lutador desafiado, Lutador desafiante){
       if(desafiado.getCategoria().equals(desafiante.getCategoria()) && desafiado != desafiante){
           this.aprovado = true;
           this.desafiado = desafiado;
           this.desafiante = desafiante;
       }else{
           this.aprovado = false;
           this.desafiado = null;
           this.desafiante = null;

       }
    }

    public void lutar(){
        if(this.aprovado){
            this.desafiante.apresentar();
            this.desafiado.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0:
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(this.desafiado.getNome() + " venceu!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(this.desafiante.getNome() + " venceu!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }

        }else {
            System.out.println("A luta não pode acontecer");
        }

    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
