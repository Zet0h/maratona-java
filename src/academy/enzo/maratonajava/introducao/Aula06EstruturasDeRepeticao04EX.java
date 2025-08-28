package academy.enzo.maratonajava.introducao;

import java.util.Scanner;

public class Aula06EstruturasDeRepeticao04EX {
    //Dado um valor de um carro descubra em quantas vezes ele pode ser parcelado
    //a condiçao é que o valor da parcela tem que >= 1000
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double valor = tec.nextDouble();

        for (int parcela = 1; parcela <= valor; parcela++) {
            double valorp = valor / parcela;
            if (valorp<1000){
                break;
            }
            System.out.println("Parcela "+parcela+" R$"+valorp);
        }

    }
}
