import java.util.Scanner;

public class Task4 {

    /**
     * Ikkita butun son berilgan Day (kun) va Month (oy).
     * (Kabisa bo'lmagan yil sanasini kiritiladi).
     * Berilgan sanadan keyingi sanani ifodalovchi programma tuzilsin.
     */
    public static void main(String[] args) {
        // Bu masala Samandar ishlagan masala bilan birlashtirildi

        Scanner input = new Scanner(System.in);

        System.out.print("d=");
        int day = input.nextInt();

        System.out.print("m=");
        int month = input.nextInt();

        if (day <= 0 || day >= 32 || month <= 0 || month >= 13) {
            if (day <= 0 || day >= 32) System.out.println("Bunday sana yo'q");
            if (month <= 0 || month >= 13) System.out.println("Bunday oy yo'q");
            System.out.println("Iltimos sanani to'g'ri kirting!!!");
            return;
        }

        if (day >= 29 && month == 2) {
            System.out.println("Kabisa yili bo'lmagan sana kiritishingiz kerak");
            System.out.println("Iltimos sanani to'g'ri kirting!!!");
            return;
        }

        switch (month) {
            // 31 bilan tugaydigan oylar
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                if (month == 12) {
                    if (day == 31) System.out.println("01.01");
                    else {
                        if ((day + 1) > 9) System.out.println((day + 1) + "." + month);
                        else System.out.println("0" + (day + 1) + "." + month);
                    }
                } else {
                    if (day == 31) {
                        if ((month + 1) > 9) System.out.println("01." + (month + 1));
                        else System.out.println("01.0" + (month + 1));
                    } else {
                        if ((day + 1) > 9) System.out.print((day + 1) + ".");
                        else System.out.print("0" + (day + 1) + ".");

                        if ((month + 1) > 9) System.out.println((month + 1));
                        else System.out.println("0" + (month + 1));
                    }
                }
                break;
            }
            // 30 bilan tugaydigan oylar
            case 4:
            case 6:
            case 9:
            case 11: {
                if (day == 30) {
                    if ((month + 1) > 9) System.out.println("01." + (month + 1));
                    else System.out.println("01.0" + (month + 1));
                } else {
                    if ((day + 1) > 9) System.out.print((day + 1) + ".");
                    else System.out.print("0" + (day + 1) + ".");

                    if ((month + 1) > 9) System.out.println((month + 1));
                    else System.out.println("0" + (month + 1));
                }
            }
            case 2: {
                if (day == 28) System.out.println("01.03");
                else {
                    if ((day + 1) > 9) System.out.println((day + 1) + ".02");
                    else System.out.println("0" + (day + 1) + ".02");
                }
                break;
            }
        }
    }
}
