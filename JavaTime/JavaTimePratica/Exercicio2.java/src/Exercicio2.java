//Exercicios
//CALCULAR QUANTOS DIAS FALTAM PRO SEU ANIVERSARIO
//Somar 30 dias na data atual
//Comparar a data do seu aniversário com a data atual e dizer se já passou ou ainda vai acontecer
//Comparar quantos dias de distancia do aniversario da leticya ate o seu
//Qual a sua idade exata em dias


import java.time.LocalDate;

public class Exercicio2 {
    static void main(String[] args) {
        //Quantos dias faltam pro meu aniversario
        LocalDate hoje = LocalDate.now();
        LocalDate meuAniversario = LocalDate.of(2026, 11, 22);
        LocalDate diasFaltando = meuAniversario.minusDays(hoje.toEpochDay());
        System.out.println("Faltam " + diasFaltando.getDayOfYear() + " dias para o meu aniversário.");
        //Somar 30 dias na data atual
        LocalDate dataFutura = hoje.plusDays(30);
        System.out.println("A data daqui a 30 dias será: " + dataFutura);
        //Comparar a data do seu aniversário com a data atual e dizer se já passou ou nao
        if(hoje.isBefore(meuAniversario)){
            System.out.println("Meu aniversário ainda vai acontecer.");
        } else {
            System.out.println("Meu aniversário já passou.");
        }
        //Comparar quantos dias de distancia do aniversario da leticya ate o seu
        LocalDate aniversarioLeticya = LocalDate.of(2026, 8, 27);
        Long diasDistancia = meuAniversario.toEpochDay() - aniversarioLeticya.toEpochDay();
        System.out.println("A distância entre o aniversário da Leticya e o meu é de " + diasDistancia + " dias.");
        //Qual a sua idade exata em dias
        LocalDate dataNascimento = LocalDate.of(1999, 11, 22);
        Long idadeEmDias = hoje.toEpochDay() - dataNascimento.toEpochDay();
        System.out.println("Minha idade exata em dias é: " + idadeEmDias + " dias.");

    }
}
