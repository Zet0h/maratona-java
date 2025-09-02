package academy.enzo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.enzo.maratonajava.javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("naruto");
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio+ " ");
        }

    }
}
