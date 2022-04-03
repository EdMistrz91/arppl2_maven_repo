package pl.sda.arppl2.maven;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        System.out.println("Wpisz swoje imię: ");

        Scanner scanner = new Scanner(System.in);
        // deklaracja zmiennej słowo i przypisanie wartości
        // która jest wynikiem funkcji next z obiektu scanner
        String slowo = scanner.next();

        System.out.println("Cześć "+ slowo + ", jesteś najlepszym programistą przy tej klawce!");

        System.out.println("podaj swój wiek: ");
        // deklaracja zmiennej liczba i przypisanie do niej wartości
        // która jest wynikiem funkcji nextIn z obiektu scanner
        int liczba = scanner.nextInt();
        liczba = liczba / 10;

        System.out.println("czy wiesz, ze zyjesz już " + liczba + " dekad");
    }
}
