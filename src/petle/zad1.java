package petle;
import java.util.Scanner;
public class zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba;

        do {
            System.out.print("Wprowadź liczbę z przedziału od 10 do 24: ");
            liczba = scanner.nextInt();
        } while (liczba < 10 || liczba > 24);

        System.out.println("Wprowadzona liczba jest poprawna.");
        scanner.close();
    }
}
