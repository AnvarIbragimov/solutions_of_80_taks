package misollar_1_10;

import java.util.Scanner;

public class Task1 {

    /**
     * Uchta son berilgan.
     * Shu sonlarning kichigini aniqlovchi programma tuzilsin.
     */
    public static void main(String[] args) {
        // Bu masala Samandar ishlagan masala bilan birlashtirildi

        Scanner scanner = new Scanner(System.in);

        System.out.println("Uchta son kiriting:");
        int a, b, c;

        System.out.println("a=");
        a = scanner.nextInt();
        System.out.println("b=");
        b = scanner.nextInt();
        System.out.println("c=");
        c = scanner.nextInt();

        int min = a < b ? a : b;
        min = min < c ? min : c;

        System.out.println("Uchta sonning eng kichigi = " + min);

    }
}
