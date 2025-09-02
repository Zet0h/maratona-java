package academy.enzo.maratonajava.javacore.Fmodificadorestatic.domain;

public class Anime {
     private String nome;
     private static int[] episodios;
    static {
        System.out.println("DENTRO DO BLOCO DE INICIALIZAÇÃO");

        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(){

         for (int episodios: Anime.episodios){
             System.out.print(episodios + " ");
         }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
