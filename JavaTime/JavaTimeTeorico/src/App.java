/*
Java time é uma api de data e hora introduzida no Java 8 para substituir as classes antigas de data e hora, como java.util.Date e java.util.Calendar. Ela é baseada na biblioteca Joda-Time e oferece uma abordagem mais moderna e robusta para lidar com datas e horas em Java.
A API de Java time é composta por várias classes, como LocalDate, LocalTime, LocalDateTime, ZonedDateTime, Duration e Period entre outras. Essas classes fornecem métodos para criar, manipular e formatar datas e horas de maneira mais intuitiva e eficiente.
A api segue o formato iso 8601 para representação de datas e horas, o que facilita a interoperabilidade entre sistemas e a manipulação de datas em diferentes fusos horários.
ano/mês/dia

-LocalDate: Representa uma data sem hora, como 2024-06-01.
-LocalTime: Representa um horário sem data, como 14:30:00.
-LocalDateTime: Representa uma data e hora combinadas, como 2024-06-01T14:30:00.
-ZonedDateTime: Representa uma data e hora com fuso horário, como 2024-06-01T14:30:00+02:00[Europe/Paris].
-Duration: Representa uma quantidade de tempo entre duas instantes, como 2 horas ou 30 minutos.
-Period: Representa uma quantidade de tempo entre duas datas, como 3 anos ou 6 meses.

Alguns metodos comuns nas classes de Java time incluem:
- now(): Retorna a data e hora atual.
- of(): Cria uma instância de data ou hora a partir de valores específicos.
- plus(): Adiciona um período ou duração a uma data ou hora.
- minus(): Subtrai um período ou duração de uma data ou hora.
- format(): Formata uma data ou hora em uma string de acordo com um padrão especificado.
- parse(): Analisa uma string para criar uma instância de data ou hora.
- isBefore(): Verifica se uma data ou hora é anterior a outra.
- isAfter(): Verifica se uma data ou hora é posterior a outra.
... e muitos outros métodos para manipulação de datas e horas.

 */
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
public class App {
    public static void main(String[] args) throws Exception {
    //Atribuindo valores
    LocalDate hoje = LocalDate.now();
    LocalDate Aniversario = LocalDate.of(2000, 6, 1);
    LocalDate strigToDate = LocalDate.parse("2024-06-01");
    LocalTime hora = LocalTime.of(14, 30, 0);
    LocalTime horaAgora = LocalTime.now();

    //Manipulando datas adicionando e retirando tempo
    LocalDate proximoAno = hoje.plusYears(1);
    LocalTime doisMinutosDepois = horaAgora.plusMinutes(2);
    LocalDate mesPassado = hoje.minusMonths(1);
    if(proximoAno.isAfter(hoje)){
        System.out.println("O próximo ano é depois de hoje.");
    } else {
        System.out.println("O próximo ano não é depois de hoje.");
    }
    //Exibindo resultados
    System.out.println("Hoje: " + hoje);
    System.out.println("Aniversário: " + Aniversario);
    System.out.println("String para Data: " + strigToDate);
    System.out.println("Hora: " + hora);
    System.out.println("Hora Agora: " + horaAgora);
    System.out.println("Próximo Ano: " + proximoAno);
    System.out.println("Dois Minutos Depois: " + doisMinutosDepois);
    System.out.println("Mês Passado: " + mesPassado);

    //Formatação de data e hora
    //Formatando a data para o estilo brasileiro
    DateTimeFormatter formatoBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");//dd: dia, MM: mês, yyyy: ano
    String dataFormatada = hoje.format(formatoBrasileiro);
    System.out.println("Data formatada (dd/MM/yyyy): " + dataFormatada);

    ZonedDateTime dataHoraZona = ZonedDateTime.now();
    System.out.println("Data e Hora com Fuso Horário: " + dataHoraZona);
    //Data e hora de nova york
    ZonedDateTime novaYork = ZonedDateTime.now().withZoneSameInstant(java.time.ZoneId.of("America/New_York"));


    //Calculo de diferença entre datas e horas usando duration e period
    //Exemplo quanto tempo voce trabalhou hoje
    LocalTime inicioTrabalho = LocalTime.of(9, 0);
    LocalTime fimTrabalho = LocalTime.of(17, 0);
    Duration duracao = Duration.between(inicioTrabalho, fimTrabalho);
    System.out.println("Duração do trabalho: " + duracao.toHours() + " horas");
    
    

    }
}
