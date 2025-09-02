package academy.enzo.maratonajava.javacore.Fmodificadorestatic.domain;

public class Carro {
    private String nome;
    private double velocidadedMaxima;
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadedMaxima) {
        this.nome = nome;
        this.velocidadedMaxima = velocidadedMaxima;

    }

    public void imprime() {
        System.out.println("----------");
        System.out.println("nome " + this.nome);
        System.out.println("velocidade maxima " + this.velocidadedMaxima);
        System.out.println("velocidade limite " + Carro.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }
    public static double getVelocidadeLimite(){
        return velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadedMaxima() {
        return velocidadedMaxima;
    }

    public void setVelocidadedMaxima(double velocidadedMaxima) {
        this.velocidadedMaxima = velocidadedMaxima;
    }


}
