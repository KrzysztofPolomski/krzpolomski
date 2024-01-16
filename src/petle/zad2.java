package petle;
import java.util.Scanner;
public class zad2 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        String litera;
        do {
            System.out.println("Proszę wpisać litere T,t,N,n:");
            litera = klawiatura.nextLine();
        } while (!litera.equalsIgnoreCase("t") && !litera.equalsIgnoreCase("T")&& !litera.equalsIgnoreCase("N") && !litera.equalsIgnoreCase("n"));

        System.out.println("Wprowadzona litera jest poprawna.");
        klawiatura.close();


    }
}