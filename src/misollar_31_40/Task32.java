package misollar_31_40;

import java.util.Scanner;

public class Task32 {

    /**
     * monthDays(year, month) funksiyasidan foydalangan holda prevDate(d,m,y) funksiya yarating
     * Kiritilgan sanadan bir kun oldingi sanani satr ko'rinishida qaytaradigan funksiya hosil qiling.
     */
    public static void main(String[] args) {

        System.out.println("32-masala");

        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        System.out.print("kun=");
        int kun = scanner.nextInt();


        System.out.print("oy=");
        int oy = scanner.nextInt();

        System.out.print("yil=");
        int yil = scanner.nextInt();

        prevDate(kun, oy, yil);
    }

    static void prevDate(int day, int month, int year) {
        // kabia
        boolean kabisaYilmi = isLeapYear(year);

        switch (month) {
            // 28  bilan tugaydigan oy
            case 2:

                int oyOxirgiKuni = 28;
                if (kabisaYilmi) oyOxirgiKuni = 29;

                if (day >= 1 && day <= oyOxirgiKuni) {
                    if (day == 1) System.out.println("31/1/" + year);
                    else System.out.println((day - 1) + "/" + month + "/" + year);
                } else System.out.println("Bunday sana yo'q !!!");

                break;

            // 31 bilan tugaydigan oylar
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                // 1-mart holati
                if (day == 1 && month == 3) {
                    if (kabisaYilmi) System.out.println("29/2/" + year);
                    else System.out.println("28/2/" + year);
                    break;
                }
                // 1-avgust holati
                if (day == 1 && month == 8) {
                    System.out.println("31/7/" + year);
                    break;
                }
                if (day == 1 && month == 1) System.out.println("31/12/" + (year - 1));
                else {
                    if (day <= 31) {
                        if (day == 1) System.out.println("30/" + (month - 1) + "/" + year);
                        else System.out.println((day - 1) + "/" + month + "/" + year);
                    } else System.out.println("Bunday sana yo'q !!!");
                }

                break;

            // 30 bilan tugaydigan oylar
            case 4:
            case 6:
            case 9:
            case 11:
                if (day <= 30) {
                    if (day == 1) System.out.println("31/" + (month - 1) + "/" + year);
                    else System.out.println((day - 1) + "/" + month + "/" + year);
                } else System.out.println("Kun xato !!!");
                break;
            default:
                System.out.println("Bunday sana yo'q !!!");
        }
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
