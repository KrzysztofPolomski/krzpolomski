package podstawy;

import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj liczbe pakietow");
        double produkt = klawiatura.nextInt();
        double cena;
        cena = produkt*99;
        if(produkt<=19 && produkt>=10)
        {
            double znizka;
            znizka = cena*0.2;
            double rabat;
            rabat =cena-znizka;
            System.out.println(rabat);
        }
        if(produkt<=49 && produkt>=20)
        {
            double znizka1;
            znizka1 = cena*0.3;
            double rabat1;
            rabat1 =cena-znizka1;
            System.out.println(rabat1);
        }
        if(produkt<=99 && produkt>=50)
        {
            double znizka2;
            znizka2 = cena*0.4;
            double rabat2;
            rabat2 =cena-znizka2;
            System.out.println(rabat2);
        }
        if(produkt>=100)
        {
            double znizka3;
            znizka3 = cena*0.5;
            double rabat3;
            rabat3 =cena-znizka3;
            System.out.println(rabat3);
        }








    }
}