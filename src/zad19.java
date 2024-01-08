public class zad19 {
    public static void main(String[] args) {
        double energy;
        energy = 12467 * 0.14;
        double cytr;
        cytr = energy * 0.64;
        int energy2 = (int)energy;
        int cytr2 = (int)cytr;
        System.out.println("liczba ankietowanych ludzi kupujacych energetyki:" + energy2);
        System.out.println("liczba ludzi preferujaca smak cytrusowy:" + cytr2);
    }
}
