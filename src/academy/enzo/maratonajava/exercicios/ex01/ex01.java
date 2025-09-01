package academy.enzo.maratonajava.exercicios.ex01;
//1 - Faça um algoritmo que leia os valores de A, B, C
// e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

import java.util.Scanner;


public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int soma = n1 + n2;
        System.out.println("O valor de " + n1 + " + " + n2 + " é: "+ soma);
        System.out.println(soma + " é menor que " + n3 + "?");

        if (soma > n3){
            System.out.println("Sim");
        }else{
            System.out.println("Nao");
        }

    }
}
