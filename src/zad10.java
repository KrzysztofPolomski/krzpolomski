import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj firstname:");
        String firstname = klawiatura.nextLine();
        System.out.println("podaj middlename:");
        String middlename = klawiatura.nextLine();
        System.out.println("podaj lastname:");
        String lastname = klawiatura.nextLine();
        char inicjal1 = firstname.charAt(0);
        char inicjal2 = middlename.charAt(0);
        char inicjal3 = lastname.charAt(0);
        System.out.println("iniciały");
        System.out.println("imie"+ inicjal1);
        System.out.println("middlename" + inicjal2);
        System.out.println("lastname"+ inicjal3);






    }
}
