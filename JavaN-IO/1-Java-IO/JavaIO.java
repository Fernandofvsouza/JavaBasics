/*
* Java io (input/output) é um conjunto de classes e interfaces que permitem a leitura e escrita de dados em arquivos,
*  console, redes e outros dispositivos de entrada/saída.
* Ele é parte da biblioteca padrão do Java e fornece uma maneira eficiente de manipular dados em diferentes formatos, como texto, binário e objetos.
*
* As principais classes do Java io incluem:
* - File: representa um arquivo ou diretório no sistema de arquivos.
* - InputStream e OutputStream: classes base para leitura e escrita de dados em formato bin
* - Reader e Writer: classes base para leitura e escrita de dados em formato de texto.
* - BufferedReader e BufferedWriter: classes que fornecem buffering para melhorar o desempenho na leitura e escrita de dados.
* - PrintStream e PrintWriter: classes que permitem a formatação de dados de saída.
* - ObjectInputStream e ObjectOutputStream: classes que permitem a leitura e escrita de objetos em formato binário.
*
*
* */


import java.io.File;

public class JavaIO {
    static void main(String[] args) {
        //Exemplo de uso da classe File para criar um arquivo e um diretório
        //Criamos uma variavel como a directorio da pasta principal do mac
        String homeDirectory = System.getProperty("user.home");
        File diretorio = new File(homeDirectory + "/meuDiretorio");

        //Verificar se o diretório existe, caso contrário, criar
        System.out.println("Diretório existe? " + diretorio.exists());
        if (!diretorio.exists()) {
            diretorio.mkdir();
            System.out.println("Diretório criado: " + diretorio.getAbsolutePath());
        }


        //Criando um arquivo dentro do diretório criado
        try{
            File arquivo = new File(diretorio, "meuArquivo.txt");
            System.out.println("Arquivo existe? " + arquivo.exists());
            if (!arquivo.exists()) {
                arquivo.createNewFile();
                System.out.println("Arquivo criado: " + arquivo.getAbsolutePath());
            }
        } catch (Exception e) {
            System.out.println("Erro ao criar o arquivo: " + e.getStackTrace());
        }


        /*
        * Atenção:
        * Cuidado com as cadeias de diretorio e arquivos pois nao conseguimos criar dois diretorios de uma vez,
        * preciamos criar um diretorio e depois criar o outro dentro do primeiro, ou seja, criar um diretorio de cada vez.
        * */


    }


}
