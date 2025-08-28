package academy.enzo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int num1 = 10;
        int num2 = 20;
        double resul = num1 / num2;
        System.out.println(resul);

        // %

        int resto = 21 % 2;
        System.out.println(resto);

        // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 < 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);

        // && || !

        int idade = 22;
        float salario = 1500;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        int contador = 0;
        contador +=1;
        contador++;
        contador--;
        System.out.println(contador);
    }
}
