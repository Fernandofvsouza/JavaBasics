public class RunTimeException {
    static void main(String[] args) {
        checkEstado("Mg");
    }
    static void checkEstado(String estado) throws EstadoRunTimeException {
        if(!estado.equalsIgnoreCase("PI")){
            throw new EstadoRunTimeException();

        }
        System.out.println("Bem vindo ao Piauí");
    }
}
