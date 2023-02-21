package misollar_1_10;

import java.util.Scanner;

public class Task7 {

    /**
     *
     */
    public static void main(String[] args) {
        // Bu masala Samandar Abduvaliev ishlagan masala bilan birlashtirildi

        System.out.println("7-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("N=");
        int n = scanner.nextInt();

        int[] massiv = new int[n + 1];

        massivniBoluvchilarBilanToldirish2(massiv, n);
        show(massiv);

        int lastOut = 0;
        for (int k = 2; k <= n; k++) {
            // k summa massiv[k]
            if (massiv[k] <= n && k == massiv[massiv[k]] && k != massiv[k] && lastOut != massiv[k]) {
                lastOut = k;
                System.out.println(k + " va " + massiv[k]);
            }
        }
    }

    static void massivniBoluvchilarBilanToldirish2(int[] massiv, int n) {
        for (int i = 1; i <= n; i++) {
            massiv[i] += boluvchilarYigindis(i);
            // i yigindisi massiv[i] da
        }
    }

    static int boluvchilarYigindis(int number) {

        int summa = 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) summa += i;
        }

        return summa;
    }

    static void massivniBoluvchilarBilanToldirish(int[] massiv, int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 2 * i; j <= n; j += i) {
                if (massiv.length - 1 < j) massiv[j] += i;
            }
        }
    }

    static void show(int[] massiv) {
        for (int i = 0; i < massiv.length; i++)
            System.out.println(i + ":" + massiv[i]);
    }
}
