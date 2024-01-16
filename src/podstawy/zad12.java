package podstawy;

import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("wybierz jedno powietrze ,woda ,stal ");
        String zakres = klawiatura.nextLine();
        System.out.println("podaj odleglos");
        double m = klawiatura.nextInt();
        switch (zakres) {
            case"powietrze":
                double czasp;
                czasp = m / 343;
                System.out.println("czas potrzebny do przebycia" + czasp);
            case"woda":
                double czasw;
                czasw = m / 1490;
                System.out.println("czas potrzebny do przebycia" + czasw);
            case"stal":
                double czass;
                czass = m / 5100;
                System.out.println("czas potrzebny do przebycia" + czass);

        }


    }

}