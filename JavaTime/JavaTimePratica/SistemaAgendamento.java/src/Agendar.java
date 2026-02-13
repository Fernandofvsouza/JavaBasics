import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Agendar {
    private LocalDate dataAgendamento;
    private LocalTime horaAgendamento;
    private String nomeCliente;

    public Agendar(LocalDate dataAgendamento, LocalTime horaAgendamento, String nomeCliente) {
        this.dataAgendamento = dataAgendamento;
        this.horaAgendamento = horaAgendamento;
        this.nomeCliente = nomeCliente;
    }

    public LocalDate getDataAgendamento() {
        return dataAgendamento;
    }

    public LocalTime getHoraAgendamento() {
        return horaAgendamento;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }


}
