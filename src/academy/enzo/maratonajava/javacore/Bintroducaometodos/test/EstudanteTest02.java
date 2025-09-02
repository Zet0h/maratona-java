package academy.enzo.maratonajava.javacore.Bintroducaometodos.test;

import academy.enzo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.enzo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante01.nome = "Enzo";
        estudante01.idade = 22;
        estudante01.sexo = 'M';

        estudante02.nome = "Alice";
        estudante02.idade = 21;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
