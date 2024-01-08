import java.util.Scanner;

public class zad20 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj liczbe ciastek");
        double a = klawiatura.nextInt();
        double ciastka;
        ciastka = a/48;
        double cukier;
        cukier = 1.5 * ciastka;
        double maslo;
        maslo = 1 * ciastka;
        double maka;
         maka = 2.75 *ciastka;
        System.out.println("potrzebujesz szkalnki cukru:"+ cukier);
        System.out.println("potrzebujesz szklanki masla:" + maslo);
        System.out.println("potrzebujesz szklankki maki:" + maka);


    }
}
