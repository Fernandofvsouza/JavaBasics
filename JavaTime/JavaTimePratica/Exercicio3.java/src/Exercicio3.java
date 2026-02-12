//Exercicios:
//Mostrar a data no formato brasileiro
//Mostrar a data e hora atual
//Converter 06/02/2026
//Mostrar 14:30 do dia 15/03/2026
//Imprimir a data de hoje com o horario 15:00 ate 17:00


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Exercicio3 {
    static void main(String[] args) {
        //Mostrar a data no formato brasileiro
        LocalDate hoje = LocalDate.now();
        DateTimeFormatter formatoBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = hoje.format(formatoBrasileiro);
        System.out.println("Data formatada (dd/MM/yyyy): " + dataFormatada);

        //Mostrar a data e horario atual formatada
        LocalDateTime hojeCompleto = LocalDateTime.now();
        DateTimeFormatter formatoBrasileiroCompleto = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraFormatada = hojeCompleto.format(formatoBrasileiroCompleto);
        System.out.println("A data e o horario atual: " + dataHoraFormatada);

        //Converter 06/02/2026 STRING PARA DATA
        String dataString = "06/02/2026";
        DateTimeFormatter formatoEntrada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataConvertida = LocalDate.parse(dataString, formatoEntrada);
        System.out.println("Data convertida: " + dataConvertida);

        //Mostrar 14:30 do dia 15/03/2026
        LocalDateTime dataHoraEspecifica = LocalDate.of(2026, 3, 15).atTime(14, 30);
        String dataHoraEspecificaFormatada = dataHoraEspecifica.format(formatoBrasileiroCompleto);
        System.out.println("Data e hora específica: " + dataHoraEspecificaFormatada);

        //Imprimir a data de hoje com o horario 15:00 ate 17:00
        LocalDateTime inicio = hoje.atTime(15, 0);
        LocalDateTime fim = hoje.atTime(17, 0);
        String intervaloFormatado = String.format("Intervalo: " +  inicio.format(formatoBrasileiroCompleto) + " - " + fim.format(formatoBrasileiroCompleto));
        System.out.println(intervaloFormatado);


    }
}
