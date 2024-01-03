import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj imie:");
        String imie = klawiatura.nextLine();
        System.out.println("Podaj age: ");
        int age = klawiatura.nextInt();
        klawiatura.nextLine();
        System.out.println("Podaj annualPay");
        double annualPay = klawiatura.nextInt();
        System.out.println("imie:" + imie);
        System.out.println("age:" + age);
        System.out.println("annualPay:" + annualPay);


    }
}
