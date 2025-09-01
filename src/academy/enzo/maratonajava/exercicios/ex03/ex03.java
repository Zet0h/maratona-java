package academy.enzo.maratonajava.exercicios.ex03;
//aça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
//caso contrário devera multiplicar A por B.
// Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.

import java.util.Scanner;


public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = 0;
        if (n1 == n2){
            System.out.println("O valor de "+ n1 + " + "+ n2 + " é: " + (n3 = ( n1 +n2)) );
        }else {
            System.out.println("O valor de "+ n1 + " X "+ n2 + " é: " + (n3 = ( n1 * n2)) );
        }

    }

}
