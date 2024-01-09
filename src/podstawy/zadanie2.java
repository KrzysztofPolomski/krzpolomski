package podstawy;

import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj dzień");
        int dzien = klawiatura.nextInt();
        System.out.println("podaj miesciac");
        int miesac = klawiatura.nextInt();
        System.out.println("podaj dwie ostatnie liczby roku");
        int rok = klawiatura.nextInt();

        int data;
        data = dzien*miesac;
        if(data==rok)
        {
            System.out.println("jest to magiczna data");
        }
        else
            System.out.println("nie jest to magiczna data");
        }





    }

