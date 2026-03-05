public class Cachorro {
    private String nome;
    private int idade;
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    public void latir() {
        System.out.println("Au au!");
    }
    public void dormindo() {
        System.out.println("Cachorro " + getNome() + " está dormindo.");
    }

    public void comer() {
        System.out.println("Cachorro " + getNome() + " está comendo.");
    }

    public void aniversario(){
        setIdade(getIdade() + 1);
        System.out.println("Parabéns " + getNome() + "! Agora você tem " + getIdade() + " anos.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
