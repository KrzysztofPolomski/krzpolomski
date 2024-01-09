package podstawy;

import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj wynik 1 testu");
        double test1 = klawiatura.nextInt();
        System.out.println("podaj wynik 2 testu");
        double test2 = klawiatura.nextInt();
        System.out.println("podaj wynik 3 testu");
        double test3 = klawiatura.nextInt();

        double srednia;
        srednia = (test1 + test2 + test3)/3;

        if(srednia<=100 && srednia>=90){
            System.out.println("ocena 5");
        }
        else if(srednia<=89 && srednia>=80)
            System.out.println("ocena 4");
        else if(srednia<=79 && srednia>=70)
            System.out.println("ocena 3");
        else if(srednia<=69 && srednia>=60)
            System.out.println("ocena 2");
        else{
            System.out.println("ocena 1");
        }

    }
}
