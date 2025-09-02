package academy.enzo.maratonajava.introducao;
/* se renda for menor que 38097, taxa 9.32%
    se renda for maior ou igual a 38098 e menor que 75517, taxa 36.97%
    se renda for maior ou igual a 75518, taxa 49.50% */

import java.util.Scanner;

public class Aula05EstruturasCondicionais2 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Digite o valor do salario anual: ");
        float renda = tec.nextFloat();
        float taxa = 0;
        String msg;
        float resultado = 0;


        if (renda < 38097) {
            taxa = 0.0932F;
            resultado = renda * taxa;

        } else if (renda >= 38098 && renda < 75517) {
            taxa = 0.3697F;
            resultado = renda * taxa;

        } else {
            taxa = 0.4950F;
            resultado = renda * taxa;
        }


        System.out.printf("O valor que devera ser pago é de:R$%.0f%n ", resultado);
    }
}
