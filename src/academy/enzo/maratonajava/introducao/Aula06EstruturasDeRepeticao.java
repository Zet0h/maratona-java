package academy.enzo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao {
    public static void main(String[] args) {
        //while, do while, for
        int count = 10;
        while (count < 10) {

            System.out.print(++count);

        }


        count = 0;
        do {
            System.out.println("dentro do do-while" + ++count);
        } while (count < 10);

        count = 0;
        for (count = 0; count < 10; count++) {
            System.out.println("FOR" + count);
        }


    }
}
