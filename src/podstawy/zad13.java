package podstawy;

import java.util.Scanner;

public class zad13 {
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
                if(m>450){
                    double  cenusia;
                    cenusia = m-450;
                    double calosc;
                    calosc = cenusia*cenamin + abonament;
                    System.out.println("laczna zaplata wynosi:" + calosc);
                }
                else{
                    System.out.println("laczna zaplata wynosi:" + abonament);

                }
                break;
            case"B":

                double cenamin1;
                cenamin1 =0.4;
                double abonament1;
                abonament1 = 59.99;
                if(m>900){
                    double  cenusia1;
                    cenusia1 = m-900;
                    double calosc1;
                    calosc1 = cenusia1*cenamin1 + abonament1;
                    System.out.println("laczna zaplata wynosi:" + calosc1);
                }
                else{
                    System.out.println("laczna zaplata wynosi:" + abonament1);

                }
                break;
            case"C":

                double abonament2;
                abonament2 = 69.99;
                    System.out.println("laczna zaplata wynosi:" + abonament2);



        }
    }
}
