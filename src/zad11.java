import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj wartość produktu:");
        int produkt = klawiatura.nextInt();
        klawiatura.nextLine();
      double podatek1;
        podatek1 = produkt* 0.04;
        double podatek2;
        podatek2 = produkt * 0.02;
        double suma;
        suma = produkt+ podatek1 + podatek2;

        System.out.println("cena produktu:" + produkt );
        System.out.println("podatek lokalny:" + podatek2 );
        System.out.println("podatek stanowy:" + podatek1);
        System.out.println("cena sprzedaży:" +suma );

    }
}
