import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj ilosc  przejechanych kilometrów:");
        int km = klawiatura.nextInt();
        klawiatura.nextLine();
        System.out.println("podaj ilos zużytych litrów paliwa");
        int l = klawiatura.nextInt();
        int kilometrynalitry;
        kilometrynalitry = km/l;
        System.out.println("liczba przejehcanych kilometrów:" + kilometrynalitry);


    }
}
