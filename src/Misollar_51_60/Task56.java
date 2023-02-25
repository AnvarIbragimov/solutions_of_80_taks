package Misollar_51_60;

import java.util.Scanner;

public class Task56 {

    /**
     * n ta elementdan tashkil topgan massiv berilgan.
     */
    public static void main(String[] args) {

        System.out.println("56-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Satr kiriting: ");
        String s = scanner.nextLine();

        while (s.contains("  ")) {
            s = s.replaceAll("  ", " ");
        }

        String[] sozlar = s.split(" ");

        String minLengthValue = "";
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < sozlar.length; i++) {
            if (minLength > sozlar[i].length()) {
                minLength = sozlar[i].length();
                minLengthValue = sozlar[i];
            }
        }

        System.out.println("min uzunligdagi so'z:" + minLengthValue);
        System.out.println("min uzunligdagi so'z uzunligi:" + minLength);


    }

}