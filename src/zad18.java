public class zad18 {
    public static void main(String[] args) {
        double akcje;
        akcje = 600 *21.77;
        double prowizja;
        prowizja= akcje * 0.02;
        double kwota;
        kwota = akcje + prowizja;
        System.out.println("cena za akcje:" + akcje);
        System.out.println("cena prowizji:" + prowizja);
        System.out.println("łaczna zapłacona kwota:"+ kwota);
    }
}
