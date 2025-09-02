package academy.enzo.maratonajava.javacore.Bintroducaometodos.test;

import academy.enzo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Enzo");
        funcionario.setIdade(22);
        funcionario.setSalario(new double[]{2900,3200,1400});

        funcionario.imprime();

    }
}
