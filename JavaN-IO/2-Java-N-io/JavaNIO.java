/*
* Java N io é uma biblioteca padrão java introduzida na versão 1.4 do Java, que fornece uma nova API para manipulação de arquivos e canais de entrada/saída (I/O).
* Ele é projetado para ser mais eficiente e flexível do que a biblioteca de I/O tradicional do Java, e é especialmente útil para aplicações que precisam lidar com grandes volumes de dados ou que precisam de acesso a arquivos de forma assíncrona.
* As principais classes do Java N io incluem:
* - java.nio.file.Path:  interface que representa um diretorio ou arquivo em nosso sistema operacional.
* - java.nio.file.Paths: classe que contem o recurso de criar um objeto que representa o diretorio informado.
* - java.nio.file.Files: classe que contem os recursos de leitura e escrita de arquivos de forma estatica.
* */


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JavaNIO {
    static void main(String[] args) {
        try{
            //Criando um arquivo utilizando o NIO
            File diretorio = new File(System.getProperty("user.home"), "meuDiretorioNIO");
            if (!diretorio.exists()) {
                diretorio.mkdir();
                System.out.println("Diretório criado: " + diretorio.getAbsolutePath());
            }
                File arquivo = new File(diretorio, "meuArquivoNIO.txt");
                if (!arquivo.exists()) {
                    arquivo.createNewFile();
                    System.out.println("Arquivo criado: " + arquivo.getAbsolutePath());
                }

            //Primeiro utilizamos o Path para localizar o arquivo ou diretorio
            String homeDirectory = System.getProperty("user.home");
            Path path = Paths.get(homeDirectory, "meuDiretorioNIO", "meuArquivoNIO.txt");

            //Lendo o path e convertendo todos os caracteres(bytes) de uma so vez
            byte[] bytesArquivo = Files.readAllBytes(path);

            //Imprimindo os bytes do arquivo
            String conteudo = new String(bytesArquivo);
            //Podemos utilizar o Files.readString(path) para ler o conteudo do arquivo e converter para string de forma mais simples
            String conteudo2 = Files.readString(path);
            System.out.println("Conteúdo do arquivo: " + conteudo2); //Tanto o conteudo quanto o conteudo2 tera o mesmo resultado, pois ambos leem o arquivo e convertem para string, porem o conteudo2 é mais simples de ser utilizado.

            //Vamos supor que o arquivo tem varias linhas, podemos utilizar o Files.readAllLines(path) para ler todas as linhas do arquivo e converter para uma lista de string, onde cada linha do arquivo sera um elemento da lista.
            List<String> linhas = Files.readAllLines(path);
            for(String linha : linhas) {
                System.out.println("Linha: " + linha);
            }

            //Escrevendo no arquivo utilizando o NIO
            List<String> nomes = new ArrayList<>();
            nomes.add("João");
            nomes.add("Maria");
            StringBuilder conteudoParaEscrever = new StringBuilder();
            nomes.forEach(n-> conteudoParaEscrever.append(n + "\n"));
            Files.write(path, conteudoParaEscrever.toString().getBytes());


        } catch (Exception e) {
            System.out.println("Erro ao criar o arquivo: " + e.getStackTrace());
        }

    }
}
