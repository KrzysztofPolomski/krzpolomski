import java.util.Scanner;

public class zad8 {
    public static void main(String[] args)
    {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj a:");
        int a = klawiatura.nextInt();
        klawiatura.nextLine();
        System.out.println("Podaj b: ");
        int b = klawiatura.nextInt();
        klawiatura.nextLine();
        System.out.println("Podaj c");
        int c = klawiatura.nextInt();
        System.out.println("Podaj d:");
        int d = klawiatura.nextInt();
        klawiatura.nextLine();
        System.out.println("Podaj e:");
        int e = klawiatura.nextInt();
        klawiatura.nextLine();
        System.out.println("Podaj f:");
        int f = klawiatura.nextInt();
        klawiatura.nextLine();
        System.out.println("Podaj g:");
        int g = klawiatura.nextInt();
        klawiatura.nextLine();
        System.out.println("Podaj h:");
        int h = klawiatura.nextInt();
        klawiatura.nextLine();

        int pomieszczenie1;
        pomieszczenie1 = a * b;
        int pomieszczenie2;
        pomieszczenie2 = c * d;
        int pomieszczenie3;
        pomieszczenie3 = e * f;
        int pomieszczenie4;
        pomieszczenie4 = g * h;
        int  powierzchnia;
        powierzchnia=pomieszczenie1+pomieszczenie2+pomieszczenie3+pomieszczenie4;


        System.out.println("powierzchnia pomieszczenia1:" + pomieszczenie1);
        System.out.println("powierzchnia pomieszczenia2:" + pomieszczenie2);
        System.out.println("powierzchnia pomieszczenia3:" + pomieszczenie3);
        System.out.println("powierzchnia pomieszczenia4:" + pomieszczenie4);
        System.out.println(powierzchnia);


    }
}
