package podstawy;

import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj 1 imie");
        String imie1 = klawiatura.next();
        System.out.println("podaj 2 imie");
        String imie2 = klawiatura.next();
        System.out.println("podaj 3 imie");
        String imie3 = klawiatura.next();
        if(imie1.compareToIgnoreCase(imie2)<0) {
            if (imie1.compareToIgnoreCase(imie3) < 0) {
                System.out.println(imie1);
            }
            if (imie2.compareToIgnoreCase(imie1) < 0) {
                if (imie2.compareToIgnoreCase(imie3) < 0) {
                    System.out.println(imie2);

                }
            } else if (imie3.compareToIgnoreCase(imie1) < 0) {
                if (imie3.compareToIgnoreCase(imie2) < 0)
                    System.out.println(imie3);
            }
        }







    }
}
