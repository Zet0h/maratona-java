package academy.enzo.maratonajava.exercicios.ex02;
//Faça um algoritmo para receber um número qualquer
// e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

import java.util.Scanner;


public class ex02 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        double num = sc.nextDouble();


        if (num % 2 == 0 && num > 0 ){
            System.out.println("O NUMERO " + num +" É PAR E POSITIVO");
        }else if(num % 2 == 0 && num < 0){
            System.out.println("O NUMERO " + num +" É PAR E NEGATIVO");
        } else if (num % 2 != 0 && num > 0) {
            System.out.println("O NUMERO " + num +" É IMPAR E POSITIVO");
        } else if (num % 2 != 0 && num < 0) {
            System.out.println("O NUMERO " + num +" É IMPAR E NEGATIVO");
        }

    }
}
