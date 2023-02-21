package misollar_1_10;

import java.util.Scanner;

public class Task2 {

    /**
     * Yil berilgan (misbat butun son).
     * Berilgan yilda nechta  kun borligini aniqlovchi programma tuzilsin.
     * Kabisa yilida 366 kub bor va kabisa bo'lamgan yilda 365 kun bor.
     * Kabisa yili deb 4 ga karrali yillarga aytiladi.
     * Lekin 100 ga karrali yillar ichida 400ga karrali bo'lganlari kabisa yili hisoblanadi.
     * Misol uchun 300, 1300 va 1900 kabisa yili emas (4 karrali bo'lgani bilan).
     * Lekin 400,1200, va 2000 yillar kabisa yilidir.
     */
    public static void main(String[] args) {
        // Bu masala Samandar ishlagan masala bilan birlashtirildi

        Scanner scanner = new Scanner(System.in);

        System.out.print("Yil kiriting=");
        int n = scanner.nextInt();

        // 4ga karrali yilni topamiz
        if (n % 4 == 0) {
            // 4ga karrali yil bo'lganlari ichidan
            // 100 karrali lekin 400 ga karrali bo'lmagan kabisa yili bo'lmaganlarni chiqarib yuboramiz.
            if (n % 100 == 0 && n % 400 != 0) {
                // kabisa yili emas
                System.out.println("Bu yil 365 kundan iborat");
            } else {
                // kabisa yili
                System.out.println("Bu yil 366 kundan iborat ");
            }
        } else {
            // 4ga karrali bo'lmasa kabisa yili emas!!!
            System.out.println("Bu yil 365 kundan iborat ");
        }

    }
}
