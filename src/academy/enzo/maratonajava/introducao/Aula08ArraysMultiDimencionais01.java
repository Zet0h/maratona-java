package academy.enzo.maratonajava.introducao;

public class Aula08ArraysMultiDimencionais01 {
    public static void main(String[] args) {
        //1,2,3,4,5 meses
        //31, 28, 31, 30 dias
        // array multidimencionais sao como tabelas completas em vez de apenas 3 espaços
        //seria como uma tabela de tabelas(array de array)
        int[][] dias = new int[3][3];
        dias[0][0] = 00;
        dias[0][1] = 01;
        dias[0][2] = 02;


        dias[1][0] = 10;
        dias[1][1] = 11;
        dias[1][2] = 12;

        dias[2][0] = 20;
        dias[2][1] = 21;
        dias[2][2] = 22;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("-----------------------");


        for (int[] arrbase:dias){
            for (int num:arrbase){
                System.out.println(num);
            }
        }

    }
}
