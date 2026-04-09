public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int empates;
    private int derrotas;



    public void apresentar(){
        System.out.println("------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + getNome());
        System.out.println("Diretamente da(e/os) " + getNacionalidade());
        System.out.println("Com " + getIdade() + " anos e " + getAltura() + "m de altura");
        System.out.println("Com " + getPeso() + " peso");
        System.out.println("E com um cartel de " + getVitorias() + " vitorias");
        System.out.println("Com " + getEmpates() + " empates");
        System.out.println("E " + getDerrotas() + " derrotas");
        System.out.println("------------------------------");
    }
    public void status(){
        System.out.println(getNome() + " é um peso " + getCategoria());
        System.out.println("Ganhou " + getVitorias() + " vezes");
        System.out.println("Empatou " + getEmpates() + " vezes");
        System.out.println("E perdeu " + getDerrotas() + " vezes");
    }
    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }
    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }
    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }



    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int empates, int derrotas) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
       if(peso >= 52.2 && peso <= 70.3){
            this.categoria = "Leve";
        }else if(peso <= 83.9){
            this.categoria = "Medio";
        }else if(peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
}
