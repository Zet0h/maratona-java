package academy.enzo.maratonajava.introducao;



public class Aula07Array03 {
    public static void main(String[] args) {
        int[] num =new int[3];
        int [] num2 = {1,2,3,4,5};
        int [] num3 = new int[]{5,4,3,2,1};

//        for (int i = 0; i < num3.length; i++) {
//            System.out.println(num3[i]);
//        }

        for (int num4 : num3) {
            System.out.println(num4);
        }
    }
}
