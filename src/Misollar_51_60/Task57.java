package Misollar_51_60;

import java.util.Scanner;

public class Task57 {

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

        // modify first letter to uppercase
        for (int i = 0; i < sozlar.length; i++) {
            sozlar[i] = Character.toUpperCase(sozlar[i].charAt(0)) + sozlar[i].substring(1);
        }

        // see results
        for (int i = 0; i < sozlar.length; i++) {
            System.out.print(sozlar[i] + " : ");
        }

    }

}