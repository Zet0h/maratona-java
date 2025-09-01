package academy.enzo.maratonajava.exercicios;
//Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

import java.util.Scanner;


public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println("O antecessor do numero " + num + " é " + (--num) + " e seu sucessor é:  " + (num+2));
    }
}
