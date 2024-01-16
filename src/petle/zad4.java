package petle;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        System.out.println("wpisz swoje imie");
        Scanner klawiatura = new Scanner(System.in);
        String litera =klawiatura.nextLine();;
        for( int i=0; i<10;i++){
            System.out.println(litera);
        }


    }
}
