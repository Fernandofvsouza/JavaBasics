import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SistemaContatos {
    static void main(String[] args) throws IOException {
        List<String> contatos = new ArrayList<>();
        contatos.add("(83) 2148-5886 Joemia Giron Lyrio Monnerat");
        contatos.add("(21) 2705-6726 Reginaldo Folly Barboza Brito");
        contatos.add("(91) 2416-8455 Mariza Gadelha Bastida Carneiro");
        contatos.add("(68) 3259-8389 Mirian Venancio Portela Ignacia");

        //Arquivo
        String home = System.getProperty("user.home");
        Path path = Paths.get(home, "contatos.txt");

        StringBuilder conteudoGeral = new StringBuilder();
        for (String contato : contatos) {
            String conteudo = contato + System.lineSeparator();
            conteudoGeral.append(conteudo);
        }
        Files.write(path, conteudoGeral.toString().getBytes());
        System.out.println("Contatos salvos em: " + path.toString());
    }
}
