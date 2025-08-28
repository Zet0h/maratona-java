package academy.enzo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais3 {
    public static void main(String[] args) {
        //imprima os dias da semana considerando 1 como domingo
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 7 para saber o dia da semana correspondente:");
        byte dia = tec.nextByte();
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }

        char sexo ='M';
        switch (sexo){
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Invalido");
                break;
        }

    }
}
