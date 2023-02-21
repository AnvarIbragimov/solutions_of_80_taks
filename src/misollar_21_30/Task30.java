package misollar_21_30;

import java.util.Scanner;

public class Task30 {

    /**
     * Mantiqiy qiymat qaytaruvchi isLeapYear(year) funksiya holsil qiling.
     * Funksiya yil kabisa bo'lsa true aks holda false qaytarsin.
     * berilgan uchta yildan nechtasi kabisa ekanligni chiqaring
     */
    public static void main(String[] args) {

        System.out.println("30-masala");

        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        System.out.print("Birinchi yil=");
        int yil1 = scanner.nextInt();
        if (isLeapYear(yil1)) counter++;

        System.out.print("Ikkiinchi yil=");
        int yil2 = scanner.nextInt();
        if (isLeapYear(yil2)) counter++;

        System.out.print("Uchinchi yil=");
        int yil3 = scanner.nextInt();
        if (isLeapYear(yil3)) counter++;


        System.out.println(yil1 + ", " + yil2 + ", " + yil3 + " yillar ichidan kabisa yillar soni:" + counter);
    }

    static boolean isLeapYear(int year) {
        // 4ga karrali yilni topamiz
        if (year % 4 == 0) {
            // 4ga karrali yil bo'lganlari ichidan
            // 100 karrali lekin 400 ga karrali bo'lmagan kabisa yili bo'lmaganlarni chiqarib yuboramiz.
            if (year % 100 == 0 && year % 400 != 0) {
                // kabisa yili emas
                return false;
            } else {
                // kabisa yili
                return true;
            }
        } else {
            // 4ga karrali bo'lmasa kabisa yili emas!!!
            return false;
        }
    }
}
