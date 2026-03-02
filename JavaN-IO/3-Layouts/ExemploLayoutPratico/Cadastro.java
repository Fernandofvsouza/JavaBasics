package ExemploLayoutPratico;

import java.time.LocalDate;

public class Cadastro {
    String nome;
    String sexo;
    Long telefone;
    LocalDate dataNascimento;
    Double valorSurgerido;
    boolean cliente;

    //Este contrutor é somente para ilustrar este exemplo
    //Evite propagar esta estrategia ao longo dos seus estudos e projetos
    public Cadastro(String nome, String sexo, Long telefone, LocalDate dataNascimento, Double valorSurgerido, boolean cliente) {
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.valorSurgerido = valorSurgerido;
        this.cliente = cliente;
    }

    public String getNome() {
        return nome;
    }

    public Long getTelefone() {
        return telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Double getValorSurgerido() {
        return valorSurgerido;
    }

    public boolean isCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Cadastro{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", telefone=" + telefone +
                ", dataNascimento=" + dataNascimento +
                ", valorSurgerido=" + valorSurgerido +
                ", cliente=" + cliente +
                '}';
    }
}
