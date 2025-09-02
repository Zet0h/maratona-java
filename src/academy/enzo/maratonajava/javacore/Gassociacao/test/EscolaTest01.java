package academy.enzo.maratonajava.javacore.Gassociacao.test;

import academy.enzo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.enzo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Popovick");
        Professor professor2 = new Professor("Paulo");
        Professor[] professores = {professor1,professor2};
        Escola escola = new Escola("Unianchieta", professores);


        escola.imprime();
    }
}
