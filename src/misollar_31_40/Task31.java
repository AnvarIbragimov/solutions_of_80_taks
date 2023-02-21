package misollar_31_40;

import java.util.Scanner;

public class Task31 {

    /**
     * isLeapYear(year) dan foydalangan holda kiritilgan yildagi 3 ta oyning kunlar sonini toping.
     */
    public static void main(String[] args) {

        System.out.println("31-masala");

        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        System.out.print("Yil=");
        int yil = scanner.nextInt();

        System.out.print("oy1=");
        int oy1 = scanner.nextInt();
        System.out.println(oy1 + " oydagi kunlar soni:" + monthDays(yil, oy1));

        System.out.print("oy2=");
        int oy2 = scanner.nextInt();
        System.out.println(oy2 + " oydagi kunlar soni:" + monthDays(yil, oy2));

        System.out.print("oy3=");
        int oy3 = scanner.nextInt();
        System.out.println(oy3 + " oydagi kunlar soni:" + monthDays(yil, oy3));
    }

    static int monthDays(int year, int month) {
        // kabia
        if (isLeapYear(year) && month == 2) return 29;

        switch (month) {
            // 28  bilan tugaydigan oy
            case 2:
                return 28;
            // 31 bilan tugaydigan oylar
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            // 30 bilan tugaydigan oylar
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 0;
        }
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
