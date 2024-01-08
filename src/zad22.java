public class zad22 {
    public static void main(String[] args) {
        double akcje;
        akcje = 32.87 *1000;
        double prowizja;
        prowizja = akcje * 0.02;
        double calosc;
        calosc = akcje + prowizja;
        double akcja2;
        akcja2 = 33.92 * 1000;
        double prowizja2;
        prowizja2 = akcja2 *0.02;
        double calosc2;
        calosc2 = akcja2 - prowizja2;
        double zysk;
        zysk = calosc2 - calosc;
        System.out.println("cena kupna:" + akcje);
        System.out.println("prowizja:" + prowizja);
        System.out.println("cena sprzedaży akcji:" + akcja2);
        System.out.println("prowizja sprzedaży:" + prowizja2);
        System.out.println("zysk wynosi" + zysk);

    }
}
