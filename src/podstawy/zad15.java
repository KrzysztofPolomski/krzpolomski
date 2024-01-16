package podstawy;

import java.util.Scanner;

public class zad15 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj liczbe czekow");
        double czek = klawiatura.nextInt();
        if(czek<20)
        {
            double cenaczek;
            cenaczek = czek * 0.1;
            double calosc;
            calosc =cenaczek + 10;
            System.out.println("opłaty pobrane:" + calosc);

        }
        else if(czek>=20 && czek<=39)
        {
            double cenaczek1;
            cenaczek1 = czek * 0.08;
            double calosc1;
            calosc1 =cenaczek1 + 10;
            System.out.println("opłaty pobrane:" + calosc1);
        }
        else if(czek>=40 && czek<=59)
        {
            double cenaczek2;
            cenaczek2 = czek * 0.06;
            double calosc2;
            calosc2 =cenaczek2 + 10;
            System.out.println("opłaty pobrane:" + calosc2);
        }
        else if(czek>=60)
        {
            double cenaczek3;
            cenaczek3 = czek * 0.04;
            double calosc3;
            calosc3 =cenaczek3 + 10;
            System.out.println("opłaty pobrane:" + calosc3);
        }

    }
}
