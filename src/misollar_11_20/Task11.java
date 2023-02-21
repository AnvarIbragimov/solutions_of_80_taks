package misollar_11_20;

import java.util.Scanner;

public class Task11 {

    /**
     * N va M sonlari berilgan, N ni M ga bo'lgandagi butun va qoldiqni / % belgilarnidan foydalanmay toping.
     */
    public static void main(String[] args) {
        // Bu masala Zafarbek ishlagan masala bilan birlashtirildi

        System.out.println("11-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("n=");
        int n = scanner.nextInt();

        System.out.print("m=");
        int m = scanner.nextInt();

        int bolinma = 0;

        while (m > n) {
            m -= n;
            bolinma++;
        }

        System.out.print("Qoldiq-> " + m);
        System.out.println();
        System.out.print("Bo'linma-> " + bolinma);
    }
}
