public class ImpressorCupom {
    public void imprimir(Cupom cupom){
        StringBuilder conteudo = new StringBuilder();
        conteudo.append(tracos());
        String nome = String.format("%-30s", cupom.nomeFantasia);
        conteudo.append(cupom.nomeFantasia + "\n");
        Endereco end = cupom.endereco;
        String endereco = String.format("%s, %s, %s, %s - %s/%s", end.logradouro, end.numero, end.complemento, end.bairro, end.cidade, end.uf);
        




    }

    private String tracos(){
        String repeated = new String(new char[50]).replace('\0', '-');
        return repeated + "\n";
    }

    private String cpfCnpj(String cpfCnpj){
        String newCnpj= "";
        if(cpfCnpj.length() == 11)
            newCnpj = cpfCnpj.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
        else
            newCnpj = cpfCnpj.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");
        return newCnpj;
    }

}