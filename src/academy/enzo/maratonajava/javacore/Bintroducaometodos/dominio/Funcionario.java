package academy.enzo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);

        if (salario == null) {
            return;
        }
        for (double salario : salario) {
            System.out.println(salario + " ");
        }
        imprimeMediaSalario();
    }

    public void imprimeMediaSalario() {
        if (salario == null) {
            return;
        }

        for (double salario : salario) {
            media += salario;
        }
        media /= salario.length;

        System.out.println("media salarial " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }

}
