package podstawy;

import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj imie i nazwisko 1 zawodnika ");
        String zawodnik1 = klawiatura.nextLine();
        System.out.println("podaj imie i nazwisko 2 zawodnika ");
        String zawodnik2 = klawiatura.nextLine();
        System.out.println("podaj imie i nazwisko 3 zawodnika ");
        String zawodnik3 = klawiatura.nextLine();
        System.out.println("podaj czas 1 zawodnika ");
        int czas1 = klawiatura.nextInt();
        System.out.println("podaj czas 2 zawodnika ");
        int czas2 = klawiatura.nextInt();
        System.out.println("podaj czas 3 zawodnika ");
        int czas3 = klawiatura.nextInt();
        if (czas1 < czas2 && czas1 < czas3 && czas2 < czas3)
        {
            System.out.println("pierwszy"+zawodnik1+czas1);
            System.out.println("drugi"+zawodnik2+czas2);
            System.out.println("trzeci"+zawodnik3+czas3);
        }
        else if(czas1 < czas2 && czas1 < czas3 && czas3 < czas2)
        {
            System.out.println("pierwszy " + zawodnik1 + czas1);
            System.out.println("drugi " + zawodnik3 + czas3);
            System.out.println("trzeci " + zawodnik2 + czas2);
        }
        else if(czas2 < czas1 && czas2 < czas3 && czas1 < czas3)
        {
            System.out.println("pierwszy " + zawodnik2 + czas2);
            System.out.println("drugi " + zawodnik1 + czas1);
            System.out.println("trzeci " + zawodnik3 + czas3);
        }
        else if(czas2 < czas1 && czas2 < czas3 && czas3 < czas1)
        {
            System.out.println("pierwszy " + zawodnik2 + czas2);
            System.out.println("drugi " + zawodnik3 + czas3);
            System.out.println("trzeci " + zawodnik1 + czas1);
        }
        else if(czas3 < czas1 && czas3 < czas2 && czas1 < czas2)
        {
            System.out.println("pierwszy " + zawodnik3 + czas3);
            System.out.println("drugi " + zawodnik1 + czas1);
            System.out.println("trzeci " + zawodnik2 + czas2);
        }
        else if(czas3 < czas1 && czas3 < czas2 && czas2 < czas1)
        {
            System.out.println("pierwszy " + zawodnik3 + czas3);
            System.out.println("drugi " + zawodnik2 + czas2);
            System.out.println("trzeci " + zawodnik1 + czas1);
        }


    }
}