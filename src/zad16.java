import java.util.Scanner;

public class zad16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj nzawe miasta:");
        String miasto = klawiatura.nextLine();
        int dlugosc = miasto.length();
        char inicjal = miasto.charAt(0);
        String male,duze;
        male = miasto.toLowerCase();
        duze = miasto.toUpperCase();

        System.out.println("liczba znaków w nazwie:" + dlugosc);
        System.out.println("pierwsza litera:" + inicjal);
        System.out.println("liczba znaków duzuch w nazwie:" + duze);
        System.out.println("liczba znaków malych  w nazwie:" + male);



    }
}
