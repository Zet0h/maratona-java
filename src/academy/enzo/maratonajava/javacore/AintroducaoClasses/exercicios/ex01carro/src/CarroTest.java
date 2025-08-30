package academy.enzo.maratonajava.javacore.AintroducaoClasses.exercicios.ex01carro.src;
/*
Crie uma classe carro com os atributos:
 nome
 modelo
 ano
E em seguida crie dois objetos distintos e imprima seus valores
 */

import academy.enzo.maratonajava.javacore.AintroducaoClasses.Exercicio.exercicios.ex01carro.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();

        carro.ano = 2003;
        carro.nome = "Civic";
        carro.modelo = "Honda";

        carro1.ano = 2004;
        carro1.nome = "Gol";
        carro1.modelo = "HBola";

        System.out.println("O nome do carro é " + carro.nome + " o  ano é " + carro.ano + " e o modelo é " + carro.modelo);
        System.out.println("O nome do carro é " + carro1.nome + " o  ano é " + carro1.ano + " e o modelo é " + carro1.modelo);
    }


}
