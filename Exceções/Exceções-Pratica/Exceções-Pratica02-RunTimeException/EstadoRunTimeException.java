public class EstadoRunTimeException extends RuntimeException {
    public EstadoRunTimeException() {
        super("O estado nao foi localizado");
    }
}
