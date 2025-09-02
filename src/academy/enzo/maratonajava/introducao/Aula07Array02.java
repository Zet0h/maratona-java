package academy.enzo.maratonajava.introducao;

public class Aula07Array02 {
    public static void main(String[] args) {
        // byte,short,int,long,float,double = 0
        //char '/0000' = ''
        //boolean false
        //string = null
        String[] nomes = new String[4];
        nomes[0] = "kallel";
        nomes[1] = "enzo";
        nomes[2] = "alice";


        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
