package petle;
import java.util.Scanner;
public class zad3 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        String litera;
        do {
            System.out.println("Proszę wpisać tak lub nie:");
            litera = klawiatura.nextLine();
        } while (litera.equalsIgnoreCase("tak") && litera.equalsIgnoreCase("nie"));

        System.out.println("Wprowadzony tekst jest poprawny.");
        klawiatura.close();


    }
}