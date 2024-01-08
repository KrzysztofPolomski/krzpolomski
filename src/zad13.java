import java.util.Scanner;

public class zad13 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj ilosc zjedzonych ciastek");
        int a = klawiatura.nextInt();
        klawiatura.nextLine();
        int ciastko;
        ciastko=30;
        int kalorie;
        kalorie= a * ciastko;
        System.out.println("liczba zjedzonych kalorii:" + kalorie);

    }
}
