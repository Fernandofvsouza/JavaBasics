public class PaniSys {
    static void main() {
        GeradorCupom geradorCupom = new GeradorCupom();

        Cupom cupomGerado = geradorCupom.gerar();
        System.out.println(cupomGerado);

        ImpressorCupom impressorCupom = new ImpressorCupom();
        impressorCupom.imprimir(cupomGerado);
    }
}
