package pl.sda.arppl2.maven;

public class MainDebugger {
    public static void main(String[] args) {

        // ########################################################################

        // int, double, float, byte, char, short, long
        // Integer, Double, Float, Byte, Character, Short, Long

        // deklaracje
        // zmienna z wartoscią która jest liczbą całkowitą
        int a;

        // zmienna z wartoscią która jest liczbą całkowitą
        // duzej precyzji (zajmuje 64 bity = 8 bajtów)
        double b;

        // małej precyzji (zajmuje 32 bity = 4 bajty)
        float c;

        String zmiennaZTekstem;
        // ########################################################################

        // Deklaracje z inicjalizacją:
        int zmiennaZWartosciaCalkowita = 5;

        zmiennaZWartosciaCalkowita = zmiennaZWartosciaCalkowita +10;
        zmiennaZWartosciaCalkowita = zmiennaZWartosciaCalkowita * 23;
        zmiennaZWartosciaCalkowita = zmiennaZWartosciaCalkowita - 10;
        zmiennaZWartosciaCalkowita = zmiennaZWartosciaCalkowita + 10;

        // to jest wypisanie tekstu
        System.out.println("zmiennaZWartosciaCalkowita");

        // to jest wypisanie wartosci
        System.out.println(zmiennaZWartosciaCalkowita);
        System.err.println("to inny wpis");
    }
}
