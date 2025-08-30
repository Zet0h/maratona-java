package academy.enzo.maratonajava.javacore.AintroducaoClasses.test;

import academy.enzo.maratonajava.javacore.AintroducaoClasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Eduardo";
        professor.idade = 52;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome +  " Idade: " + professor.idade + " Sexo: " + professor.sexo);
    }
}
