package podstawy;

import java.util.Scanner;

public class zadanie10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj liczbe kalorii");
        double kalorie = klawiatura.nextInt();
        System.out.println("podaj liczbe gramow tłuszczu");
        double tluszcz = klawiatura.nextInt();
        double kalorietlusczu;
        kalorietlusczu = tluszcz * 9 ;
        double suma;
        suma = kalorie + kalorietlusczu;
        double procent;
        procent = kalorietlusczu/suma;
        if(procent<0.3)
            {
                System.out.println("produkt niskotluszcowy");
            }
        if(kalorietlusczu>suma)
        {
            System.out.println("liczba kalorii z tłuszczu jest wyższa niz łączna liczba kalorii");

        }
        System.out.println("procent kalorii pochodzacych z tluszczu" + procent + "%");



    }
}
