package misollar_21_30;

import java.util.Scanner;

public class Task25 {

    /**
     * isPalidrom(n) funksiya hosil qiling. Agar n soni palidrom bo'lsa yani
     * boshidan o'qilganda ham ortdan o'qilganda ham bir xil bo'lsa true aks holdda false qaytaring.
     * Bu funksiya 3 ta son bilan tekshiring va ularning nechtasi palindrom son ekanligini aniqlang.
     */
    public static void main(String[] args) {

        System.out.println("25-masala");

        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        System.out.print("Birinchi son:");
        int birinchiSon = scanner.nextInt();
        if (isPalindrom(birinchiSon)) counter++;

        System.out.print("Ikkinchi son:");
        int ikkinchi = scanner.nextInt();
        if (isPalindrom(ikkinchi)) counter++;

        System.out.print("Uchinchi son:");
        int uchinchiSon = scanner.nextInt();
        if (isPalindrom(uchinchiSon)) counter++;

        System.out.println("Palindrom sonlar soni:" + counter);
    }

    // n soni palindromligini tekshiradigan funksiya
    static boolean isPalindrom(int n) {
        //buni tekshirish uchun sonni boshlang'ich qiymatini saqlagan holda
        // n soni teskari o'qiladigan sonni topish kerak va ularni tengligini tekshirish kerak bo'ladi

        int boshlangichSon = n;
        int teskariSon = 0;
        while (n > 0) {
            teskariSon = teskariSon * 10 + (n % 10);
            n = n / 10;
        }

        return boshlangichSon == teskariSon;
    }
}