public class Aula {
    String dia;
    double duracao;
    String assunto;
    String materia;
    String professor;

    void status(){
        System.out.println("Dia " + this.dia);
        System.out.println("Duração " + this.duracao);
        System.out.println("Assunto " + this.assunto);
        System.out.println("Matéria " + this.materia);
        System.out.println("Professor " + this.professor);
    }

    void assistir(){
        System.out.println("Estou assistindo a aula do professor " + this.professor);

    }

    void terminarAula(){
        System.out.println("A aula de " + this.materia + " acabou!");

    }

    void fazerAnotacao(){
        System.out.println("Estou fazendo anotações sobre " + this.assunto);
    }

    void fazerExercicio(){
        System.out.println("Estou fazendo os exercícios de " + this.materia);
    }

}
