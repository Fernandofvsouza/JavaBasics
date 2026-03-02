package ExemploLayoutPratico;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
* Vamos ver como seria o algoritmo para ler e escrever de forma delimitada e posicional
* */
public class SistemaCadastro {
    static void main(String[] args) {
        List<Cadastro> cadastros = new ArrayList<>();
        cadastros.add(new Cadastro("Joemia Giron Lyrio Monnerat","F", 8321485886L, LocalDate.of(1984,6,30),35.0, false));
        cadastros.add(new Cadastro("Reginaldo Folly Barboza Brito","M", 2127056726L, LocalDate.of(1990,3,17),40.0, true));
        cadastros.add(new Cadastro("Mariza Gadelha Bastida Carneiro","F", 9124168455L, LocalDate.of(1889,8,18),40.0, false));
        cadastros.add(new Cadastro("Mirian Venancio Portela Ignacia","M", 6832598389L, LocalDate.of(1975,11,21),29.0, true));

        escreverLayoutDelimitado(cadastros);

        escreverLayoutPosicional(cadastros);

    }
    public static void escreverLayoutDelimitado(List<Cadastro> cadastros){
        System.out.println("***** - LAYOUT DELIMITADO - *****");

        try {
            StringBuilder conteudo = new StringBuilder();

            for (Cadastro cadastro : cadastros) {
                conteudo.append(cadastro.getNome() + ";");
                conteudo.append(cadastro.getSexo() + ";");
                conteudo.append(cadastro.getTelefone() + ";");
                conteudo.append(cadastro.getDataNascimento() + ";");
                conteudo.append(cadastro.getValorSurgerido() + ";");
                conteudo.append(cadastro.isCliente());
                conteudo.append(System.lineSeparator());
            }
            System.out.println(conteudo.toString());
            String home = System.getProperty("user.home");
            Path arquivoDestino = Paths.get(home, "cadastros-delimitados.txt");

            Files.write(arquivoDestino, conteudo.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE);

        } catch (Exception ex){
            ex.printStackTrace();
        }
        lerLayoutDelimitado();
    }

    public static List<Cadastro>  lerLayoutDelimitado(){
        List<Cadastro> cadastros = new ArrayList<>();

        try {
            Path arquivoOrigem = Paths.get(System.getProperty("user.home"), "cadastros-delimitados.txt");

            List<String> linhas = Files.readAllLines(arquivoOrigem);
            // imprimindo cada linha obtida no arquivo
            for(String linha:linhas){
                String[] colunas = linha.split("\\;"); // -> quebra uma linha em colunas com base no delimitador;
                String nome = colunas[0];
                String sexo = colunas[1];
                Long telefone = Long.valueOf(colunas[2]);
                LocalDate dataAniversario = LocalDate.parse(colunas[3]);
                Double valorSugerido = Double.valueOf(colunas[4]);
                boolean cliente = Boolean.valueOf(colunas[5]);

                // criando um novo cadastro e adicionando na lista de acordo com os valores de cada coluna
                cadastros.add(new Cadastro(nome,sexo,telefone,dataAniversario,valorSugerido,cliente));
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }

        // ao retornar a lista de objetos
        // você poderá realizar qualquer ação com a lista retornada

        return cadastros;
    }

    public static void escreverLayoutPosicional(List<Cadastro> cadastros) {
        try {
            System.out.println("***** - LAYOUT POSICIONAL - *****");

            StringBuilder conteudo = new StringBuilder();
            for (Cadastro cadastro : cadastros) {
                String nome = cadastro.getNome();
                // calma, não será assim para sempre
                if (nome.length() > 30)
                    nome = nome.substring(0, 30);

                // pesquise sobre String.format
                if (nome.length() < 30)
                    nome = String.format("%-30s", nome);

                conteudo.append(nome);
                conteudo.append(cadastro.getSexo().toUpperCase());
                conteudo.append(cadastro.getTelefone());
                conteudo.append(cadastro.getDataNascimento());

                DecimalFormat decimalFormat = new DecimalFormat("#0000.00");

                String valorFormatado = decimalFormat.format(cadastro.getValorSurgerido());
                conteudo.append(valorFormatado.replaceAll("\\,", "\\.")); // -> troca , por .
                conteudo.append(cadastro.isCliente() ? "1" : "0");

                // nova linha
                conteudo.append(System.lineSeparator());
            }

            System.out.println(conteudo.toString());

            String home = System.getProperty("user.home");
            Path arquivoDestino = Paths.get(home, "cadastros-posicionais.txt");

            Files.write(arquivoDestino, conteudo.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE);
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

    public static List<Cadastro>  lerLayoutPosicional(){
        List<Cadastro> cadastros = new ArrayList<>();

        try {
            String home = System.getProperty("user.home");
            Path arquivoOrigem = Paths.get(home, "cadastros-posicionais.txt");

            List<String> linhas = Files.readAllLines(arquivoOrigem);
            // imprimindo cada linha obtida no arquivo
            for(String linha:linhas){
                String nome = linha.substring(0,30).trim(); // -> pego os caracteres da posição 0 a 30, trim() remove espaços laterias
                String sexo = linha.substring(30,31); // observe que sempre o primeiro parâmetro tem o valor que o segundo parâmetro anterior
                Long telefone = Long.valueOf(linha.substring(31,41)); // 41-31=10
                LocalDate dataAniversario = LocalDate.parse(linha.substring(41,51));
                Double valorSugerido = Double.valueOf(linha.substring(51,58));
                boolean cliente = linha.substring(58,59).equals("1");

                // criando um novo cadastro e adicionando na lista de acordo com os valores de cada coluna
                cadastros.add(new Cadastro(nome,sexo,telefone,dataAniversario,valorSugerido,cliente));
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }

        // ao retornar a lista de objetos
        // você poderá realizar qualquer ação com a lista retornada

        return cadastros;
    }

}

