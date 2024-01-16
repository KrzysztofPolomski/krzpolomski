package podstawy;

import java.util.Scanner;

public class zad14 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("wybierz jedno A,B,C");
        String zakres = klawiatura.nextLine();
        System.out.println("podaj minuty rozmow");
        double m = klawiatura.nextInt();
        switch (zakres) {
            case"A":
                double cenamin;
                cenamin =0.45;
                double abonament;
                abonament = 39.99;
                double cenamin1;
                cenamin1 =0.4;
                double abonament1;
                abonament1 = 59.99;
                if(m>450){
                    double  cenusia;
                    cenusia = m-450;
                    double calosc;
                    calosc = cenusia*cenamin + abonament;
                    double  cenusia2;
                    cenusia2 = m-900;
                    double calosc2;
                    calosc2 = cenusia2*cenamin1 + abonament1;
                    double zaosz;
                    zaosz = calosc - calosc2;
                    System.out.println("zaoszczedzisz wybierajac pakiet B" + zaosz);
                    double zaosz1;
                    zaosz1 = calosc - 69.99;
                    System.out.println("zaoszczedzisz wybierajac pakiet C" + zaosz1);
                }

                break;
            case"B":

                double cenamin3;
                cenamin3 =0.4;
                double abonament3;
                abonament3 = 59.99;
                if(m>900){
                    double  cenusia1;
                    cenusia1 = m-900;
                    double calosc3;
                    calosc3 = cenusia1*cenamin3 + abonament3;
                    double zaoszdzanie;
                    zaoszdzanie = calosc3 - 69.99;
                    System.out.println("zaoszczedzisz" + zaoszdzanie);

                }

                break;
            case"C":



        }
    }
}

