import java.util.Scanner;

public class zad21 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj kwote pieniedzy poczatkowo zdeponowanej w koncie");
        double cena = klawiatura.nextDouble();
        System.out.println("podaj roczna stopke");
        double stopka = klawiatura.nextDouble();
        System.out.println("podaj ile razy w roku odsetki są kapitalizowane (np. przy kapitalizacji miesięcznej wpisz 12, \n" +
                "a przy kapitalizacji kwartalnej — 4),");
        double cena2 = klawiatura.nextDouble();
        System.out.println("podaj liczbe lat, przez jakie środki będą znajdować się na koncie i generować odsetk");
        double cena3= klawiatura.nextDouble();
        double kwota;
        kwota =1 + stopka/cena2;
        double kwota2;
        kwota2 = cena * kwota;
        System.out.println("bedziesz posiadal:" + kwota2);
        System.out.println("po"+ cena3+"latach:");
    }
}
