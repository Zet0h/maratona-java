package academy.enzo.maratonajava.introducao;
/*
Dados os valores de 1 a 7, imprima onde domingo é o dia 1.Imprima se é um dia util ou nao.

 */


import java.util.Scanner;

public class Aula05EstruturasCondicionais4Ex {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        byte dia = tec.nextByte();
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
            default:
                System.out.println("Numero invalido");
                break;
        }
    }
}
