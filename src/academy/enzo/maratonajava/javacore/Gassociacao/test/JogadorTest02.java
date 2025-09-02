package academy.enzo.maratonajava.javacore.Gassociacao.test;

import academy.enzo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.enzo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("fallen");
        Time time = new Time("Furia");

        jogador1.setTime(time);

        jogador1.imprime();
    }
}
