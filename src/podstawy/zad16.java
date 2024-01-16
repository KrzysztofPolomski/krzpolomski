package podstawy;

import java.util.Scanner;

public class zad16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj liczbe zakupionych ksiazek");
        double czek = klawiatura.nextInt();
        if(czek==0)
        {
            System.out.println("nic nie dostajesz");
        }
        else if(czek==1)
        {
            System.out.println("otrzymujesz 5 punktow:");
        }
        else if(czek==2)
        {
            System.out.println("otrzymujesz 15 punktow:");
        }
        else if(czek==3)
        {
            System.out.println("otrzymujesz 30 punktow:");
        }
        else if(czek>=4){
            System.out.println("otrzymujesz 60 punktow:");
        }

    }
}
