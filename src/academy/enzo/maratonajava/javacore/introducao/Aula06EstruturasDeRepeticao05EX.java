package academy.enzo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05EX {
    //Dado um valor de um carro descubra em quantas vezes ele pode ser parcelado
    //a condiçao é que o valor da parcela tem que >= 1000
    public static void main(String[] args) {
        double valorTotal= 30000;
        for (int parcela = (int) valorTotal; parcela >= 1 ; parcela--) {
            double valorparcela = valorTotal / parcela;
            if (valorparcela<1000){
                continue;
            }
            System.out.println("Parcela " + parcela+" R$"+valorparcela);
        }
    }
}

