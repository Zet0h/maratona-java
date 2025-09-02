package academy.enzo.maratonajava.javacore.Csobrecargametodos.test;

import academy.enzo.maratonajava.javacore.Csobrecargametodos.dominio.Series;

public class SeriesTest01 {
    public static void main(String[] args) {
        Series series = new Series();
        series.init("DEXTER",10,"tv ");
        series.init("dexter",10,"tv","DRAMA");

        series.imprime();
    }
}
