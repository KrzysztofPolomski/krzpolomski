package podstawy;

import java.util.Scanner;

public class zadanie9 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj wage");
        double waga = klawiatura.nextInt();
        System.out.println("podaj kilometry");
        double km = klawiatura.nextInt();
        if(waga<=1)
        {
            double koszt1 = (km/500)*1.1;
            System.out.println("koszt wynosi"+ koszt1);
        }
        if(waga>1 && waga==3)
        {
            double koszt1 = (km/500)*2.2;
            System.out.println("koszt wynosi"+ koszt1);
        }
        if(waga>3 && waga==5)
        {
           double koszt1 = (km/500)*3.7;
            System.out.println("koszt wynosi"+ koszt1);
        }
        if(waga>5)
        {
           double koszt1 = (km/500)*3.8;
            System.out.println("koszt wynosi"+ koszt1);
        }



    }
}
