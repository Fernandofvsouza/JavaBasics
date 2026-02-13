import java.util.Scanner;

public class SistemaAgendamento {
    static int opcao;
    static Agendar[] agendamentos = new Agendar[100];
    static Scanner scanner = new Scanner(System.in);
    static void main(String[] args) {
        do{
            System.out.println("1 - Agendar");
            System.out.println("2 - Listar Agendamentos");
            System.out.println("3 - Cancelar Agendamento");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();

            switch(opcao){
                case 1:
                    AgendamentoService.agendar(agendamentos);
                    break;
                case 2:
                    AgendamentoService.listarAgendamentos(agendamentos);
                    break;
                case 3:
                    AgendamentoService.cancelarAgendamento(agendamentos);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        }while(opcao != 0);
    }
}
