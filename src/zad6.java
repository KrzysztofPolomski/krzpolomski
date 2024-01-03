public class zad6 {
    public static void main(String[] args) {
        int pomieszczenie1;
        pomieszczenie1 = 3 * 4;
        int pomieszczenie2;
        pomieszczenie2 = 3 * 4;
        int pomieszczenie3;
        pomieszczenie3 = 2 * 3;
        int pomieszczenie4;
        pomieszczenie4 = 2 * 2;
        double powierzchnia;
        powierzchnia = pomieszczenie1 + pomieszczenie2 + pomieszczenie3 + pomieszczenie4;
        System.out.println("powierzchnia pomieszczenia1:" + pomieszczenie1);
        System.out.println("powierzchnia pomieszczenia2:" + pomieszczenie2);
        System.out.println("powierzchnia pomieszczenia3:" + pomieszczenie3);
        System.out.println("powierzchnia pomieszczenia4:" + pomieszczenie4);
        System.out.println(powierzchnia);
        double metry;
        metry =(double)powierzchnia/4;
        System.out.println("metry na jedna osobe wynosza:" + metry);
    }
}
