import java.util.Scanner;

public class zad14 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj ocene z testu1:");
        int test1 = klawiatura.nextInt();
        klawiatura.nextLine();
        System.out.println("podaj ocene z testu2:");
        int test2 = klawiatura.nextInt();
        klawiatura.nextLine();
        System.out.println("podaj ocene z testu3:");
        int test3 = klawiatura.nextInt();
        double srednia;
        srednia = (test1 + test2 +test3)/3;
        System.out.println("srednia:" + srednia );


    }
}
