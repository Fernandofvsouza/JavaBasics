import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AgendamentoService extends Agendar{
    public AgendamentoService(LocalDate dataAgendamento, LocalTime horaAgendamento, String nomeCliente) {
        super(dataAgendamento, horaAgendamento, nomeCliente);
    }
    public static void agendar(Agendar[] agendamentos){
       Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine().trim();
        if(nomeCliente.isEmpty()){
            System.out.println("O nome do cliente nao pode ser vazio. Tente novamente.");
            return;
        }


        // Ler e validar data (aceita yyyy-MM-dd ou dd/MM/yyyy)
        LocalDate dataAgendamento;
        DateTimeFormatter IsoFormater = DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter brFormater = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Digite a data do agendamento (yyyy-MM-dd ou dd/MM/yyyy);");
        String dataInput = scanner.nextLine().trim();
        try{
            if(dataInput.contains("/")){
                dataAgendamento = LocalDate.parse(dataInput, brFormater);
            }else{
                dataAgendamento = LocalDate.parse(dataInput, IsoFormater);
            }
        }catch(DateTimeParseException e){
            System.out.println("Formato de data inválido. Use yyyy-MM-dd ou dd/MM/yyyy.");
            return;
        }




        // Verificar que a data não é anterior à data atual
       LocalDate hoje = LocalDate.now();
        if(dataAgendamento.isBefore(hoje)){
            System.out.println("A data do agendamento não pode ser anterior à data atual. Escolha outra data.");
            return;
        }

        // Ler e validar hora
        LocalTime horaAgendamento;
        System.out.println("Digite a hora do agendamento (HH:mm):");
        String horaInput = scanner.nextLine().trim();
        try{
            horaAgendamento = LocalTime.parse(horaInput, DateTimeFormatter.ofPattern("HH:mm"));
        }catch(DateTimeParseException e){
            System.out.println("Formato de hora inválido. Use HH:mm (ex: 14:30).");
            return;
        }

        // Verificar horário de funcionamento (assumido 08:00 - 18:00)
        LocalTime abertura = LocalTime.of(8, 0);
        LocalTime fechamento = LocalTime.of(18, 0);
        if(horaAgendamento.isBefore(abertura) || horaAgendamento.isAfter(fechamento)){
            System.out.println("O horário do agendamento deve ser entre 08:00 e 18:00. Escolha outro horário.");
            return;
        }

        // Verificar conflito: mesmo dia e mesma hora
        for(Agendar a : agendamentos){
            if(a != null){
                if(a.getHoraAgendamento().equals(horaAgendamento) && a.getDataAgendamento().equals(dataAgendamento)){
                    System.out.println("Já existe um agendamento para esse horário. Escolha outro horário ou data.");
                    return;
                }
            }
        }

        // Criando o agendamento
        Agendar novoAgendamento = new AgendamentoService(dataAgendamento, horaAgendamento, nomeCliente);

        // Inserir no primeiro slot livre
        for(int i = 0; i < agendamentos.length; i++){
            if (agendamentos[i] == null) {
                agendamentos[i] = novoAgendamento;
                System.out.println("Agendamento criado com sucesso para " + nomeCliente + " no dia " + dataAgendamento + " às " + horaAgendamento);
                return;
            }
        }

        // Se chegou aqui, array cheio
        System.out.println("Não há espaços livres para novos agendamentos. Aumente a capacidade.");
    }


    public static void listarAgendamentos(Agendar[] agendamentos){
        System.out.println("Agendamentos: ");
        boolean encontrou = false;
        for(Agendar agendamento : agendamentos){
            if(agendamento != null){
                encontrou = true;
                System.out.println("Cliente: " + agendamento.getNomeCliente() + " - Data: " + agendamento.getDataAgendamento() + " - Hora: " + agendamento.getHoraAgendamento());
            }
        }
        if(!encontrou){
            System.out.println("Nenhum agendamento encontrado.");
        }
    }

    public static void cancelarAgendamento(Agendar[] agendamentos){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do cliente para cancelar o agendamento:");
        String nomeCliente = scanner.nextLine().trim();
        boolean encontrou = false;
        for(int i = 0; i < agendamentos.length; i++){
            if(agendamentos[i] != null){
                String nomeArmazenado = agendamentos[i].getNomeCliente();
                if(nomeArmazenado != null && nomeCliente.equalsIgnoreCase(nomeArmazenado)){
                    agendamentos[i] = null;
                    encontrou = true;
                    System.out.println("Agendamento de " + nomeArmazenado + " cancelado com sucesso.");
                    break;
                }
            }

        }
        if(!encontrou){
            System.out.println("Nenhum agendamento encontrado para o(a) cliente: " + nomeCliente);
        }
    }
}