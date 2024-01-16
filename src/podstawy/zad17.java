package podstawy;

import java.util.Scanner;

public class zad17 {
    public static void main(String[] args) {
        Scanner produkt = new Scanner(System.in);

        System.out.println("Czy któraś z osób jest na diecie wegetariańskiej?  ");
        String wege = produkt.next();
        System.out.println("Czy któraś z osób jest na diecie weganskiej?  ");
        String wegan = produkt.next();
        System.out.println("Czy któraś z osób jest na diecie bezglutenowej?  ");
        String bezglut = produkt.next();

        if(wege == "tak" & wegan == "tak" & bezglut == "tak"){
            System.out.println("Czy któraś z osób jest na diecie wegetariańskiej:  "+ wege);
            System.out.println("Czy któraś z osób jest na diecie wegetariańskiej:  "+ wegan);
            System.out.println("Czy któraś z osób jest na diecie bezglutenowej:  "+ bezglut);

            System.out.println("Możecie wybrać się do następujących restauracji:  ");

            System.out.println("Kawiarnia na Rogu\n" +
                    "Kuchnia u Szefa");

        }
        else if(wege == "tak" & wegan == "nie" & bezglut == "tak"){
            System.out.println("Czy któraś z osób jest na diecie wegetariańskiej:  "+ wege);
            System.out.println("Czy któraś z osób jest na diecie wegetariańskiej:  "+ wegan);
            System.out.println("Czy któraś z osób jest na diecie bezglutenowej:  "+ bezglut);

            System.out.println("Możecie wybrać się do następujących restauracji:  ");

            System.out.println("Pizzeria przy Dworcowej");

        }
        else if(wege == "tak" & wegan == "nie" & bezglut == "nie"){
            System.out.println("Czy któraś z osób jest na diecie wegetariańskiej:  "+ wege);
            System.out.println("Czy któraś z osób jest na diecie wegetariańskiej:  "+ wegan);
            System.out.println("Czy któraś z osób jest na diecie bezglutenowej:  "+ bezglut);

            System.out.println("Możecie wybrać się do następujących restauracji:  ");

            System.out.println("Włoskie Specjały");

        }
        else if(wege == "nie" & wegan == "nie" & bezglut == "nie"){
            System.out.println("Czy któraś z osób jest na diecie wegetariańskiej:  "+ wege);
            System.out.println("Czy któraś z osób jest na diecie wegetariańskiej:  "+ wegan);
            System.out.println("Czy któraś z osób jest na diecie bezglutenowej:  "+ bezglut);

            System.out.println("Możecie wybrać się do następujących restauracji:  ");

            System.out.println("Luksusowe Burgery u Jarka");

        } else  {
            System.out.println("Czy któraś z osób jest na diecie wegetariańskiej:  "+ wege);
            System.out.println("Czy któraś z osób jest na diecie wegetariańskiej:  "+ wegan);
            System.out.println("Czy któraś z osób jest na diecie bezglutenowej:  "+ bezglut);

            System.out.println("Możecie wybrać się do następujących restauracji:  ");

            System.out.println("luksusowe Burgery u Jarka");
        }


    }
}