import java.util.Scanner;

public class zad23 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj długośc rzędu w metrach");
        double a = klawiatura.nextDouble();
        System.out.println("podaj ilości miejsca zajmowanego przez okratowanie w metrach");
        double b = klawiatura.nextDouble();
        System.out.println("podaj odległości między sadzonkami w metrach");
        double c = klawiatura.nextDouble();
        double sadzonki;
        sadzonki = (a-2*b)/c;
        System.out.println("w rzędzie zmiesci sie" +sadzonki+"sadzonek");
    }
}
