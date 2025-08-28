package academy.enzo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        /*
        int idade = 22;
        String categoria;

        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";1
        }
        System.out.println(categoria);

         */

        double salario = 6000;
        String msgD = "Eu vou doar";
        String msgN = "nao vou doar";
        String result = salario > 5000 ? msgD : msgN;

        System.out.println(result);
    }
}
