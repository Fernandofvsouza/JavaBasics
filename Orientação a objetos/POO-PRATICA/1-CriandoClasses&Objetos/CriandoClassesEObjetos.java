public class CriandoClassesEObjetos {
    static void main(String[] args) {
        Esferografica c1 = new Esferografica();
        c1.cor = "Azul";
        c1.getPonta();
        c1.tampada = false;
        c1.modelo = "Bic Cristal";
        c1.destampar();
        c1.status();
        c1.rabiscar();


        Esferografica c2 = new Esferografica();
        c2.cor = "Vermelha";
        c2.getPonta();
        c2.tampada = true;
        c2.modelo = "Bic Cristal";
        c2.status();
        c2.rabiscar();


        Aula algoritmos = new Aula();
        algoritmos.assunto = "Algoritmos de ordenação";
        algoritmos.dia = "Segunda-feira";
        algoritmos.dia = "Quarta-feira";
        algoritmos.duracao = 2.0;
        algoritmos.materia = "Algoritmos";
        algoritmos.professor = "Professor Guanabara";
        algoritmos.status();
        algoritmos.assistir();
        algoritmos.fazerAnotacao();
        algoritmos.fazerExercicio();
        algoritmos.terminarAula();


        Molho siracha = new Molho();
        siracha.nome = "Siracha";
        siracha.sabor = "Picante";
        siracha.ingredientes = new String[]{"Pimenta", "Alho", "Vinagre"};
        siracha.quantidade = 250.0;
        siracha.status();
        siracha.preparar();
        siracha.tampar();



    }

}
