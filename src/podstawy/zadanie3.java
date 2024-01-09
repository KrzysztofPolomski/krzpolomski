package podstawy;

import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj wage");
        double waga = klawiatura.nextInt();
        System.out.println("podaj wzrost");
        double wzrost = klawiatura.nextInt();

        double wzrost1 = Math.pow(wzrost,2);
        double BMI = waga/wzrost1;
        if(BMI<18.5){
            System.out.println("masz niedowage");
        }
        else if(BMI>18.5 && BMI<25){
            System.out.println("jestes optymalny jak hajduk");
        }
        else if(BMI>25){
            System.out.println("masz nadwage");
        }
    }
}
