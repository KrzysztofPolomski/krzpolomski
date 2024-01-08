import java.util.Scanner;

public class zad15 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj cene detaliczną plytki:");
        int a = klawiatura.nextInt();
        klawiatura.nextLine();
        double zysk;
        zysk = a* 0.4;
        System.out.println("zysk wynosi:" + zysk);

    }
}
