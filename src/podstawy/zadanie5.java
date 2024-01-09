package podstawy;

import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {
            Scanner klawiatura = new Scanner(System.in);
            System.out.println("podaj mase obiektu");
            double masa = klawiatura.nextInt();
            double ciezar;
            ciezar = masa * 9.8;
            if(ciezar>1000){
                System.out.println("obiekt jest za ciezki");
            }
            else if(ciezar<10)
                System.out.println("obiekt jest za lekki");




    }
}
