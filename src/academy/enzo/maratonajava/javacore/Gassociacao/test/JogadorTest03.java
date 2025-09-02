package academy.enzo.maratonajava.javacore.Gassociacao.test;

import academy.enzo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.enzo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("neymar");
        Time time = new Time("Seleção Brasileira");
        Jogador[] jogadores = {jogador,jogador2};


        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("----JOGADOR -----");
        jogador.imprime();

        System.out.println("----TIME -----");
        time.imprime();
    }
}
