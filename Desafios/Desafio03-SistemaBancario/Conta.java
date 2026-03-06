public class Conta {
    private String nomeTitular;
    private long numeroConta;
    private double saldo;

    public Conta(String nomeTitular, long numeroConta, double saldo) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Deposito de R$ " + valor + " realizado com sucesso. Novo saldo: R$ " + saldo);
        }else{
            System.out.println("Valor invalido, tente novamente com um valor positivo.");
        }
    }

    public void sacar(double valor){
        if(valor > 0){
            if(saldo >= valor){
                saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso. Novo saldo: R$ " + saldo);
            }else{
                System.out.println("Saldo insuficiente para realizar o saque. Saldo atual: R$ " + saldo);
            }
        }else {
            System.out.println("Valor invalido, tente novamente com um valor positivo.");
        }
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public void exibirDados(){
        System.out.println("Nome do titular: " + nomeTitular);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo: R$ " + saldo);
    }
}
