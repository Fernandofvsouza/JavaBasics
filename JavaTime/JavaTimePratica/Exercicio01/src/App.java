
import java.time.LocalDate;
import java.time.Period;

public class App {
    public static void main(String[] args) throws Exception {
        //Ex01 verificando quantos meses e dias falta pro meu aniversario
        LocalDate dataAtual = LocalDate.now();
        LocalDate meuAniversario = LocalDate.of(2026, 11, 22);
        Period periodo = Period.between(dataAtual, meuAniversario);
        System.out.println("Faltam " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias para o meu aniversário.");

        //Ex02 verificando quantos anos, meses e dias tenho de vida
        LocalDate dataNascimento = LocalDate.of(1999, 11, 22);
        Period periodoDeVida = Period.between(dataNascimento, dataAtual);
        System.out.println("Tenho " + periodoDeVida.getYears() + " anos, " + periodoDeVida.getMonths() + " meses e " + periodoDeVida.getDays() + " dias de vida.");
    }
}
