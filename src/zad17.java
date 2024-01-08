import java.util.Scanner;

public class zad17 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj cene za posilek:");
        int a = klawiatura.nextInt();
        klawiatura.nextLine();
        double podatek;
        podatek = a * 0.0675;
        double napiwek;
        napiwek= a * 0.2;
        double kwota;
        kwota = a + podatek + napiwek;
        System.out.println("cena posiłku:" + a);
        System.out.println("podatek:" + podatek);
        System.out.println("napwiek:" + napiwek);
        System.out.println("kwota:" + kwota);

    }
}
