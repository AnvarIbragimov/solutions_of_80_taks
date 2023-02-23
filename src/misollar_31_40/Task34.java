package misollar_31_40;

import java.util.Random;
import java.util.Scanner;

public class Task34 {

    /**
     * n ta elementdan tashkil topgan massiv berilgan.
     */
    public static void main(String[] args) {

        System.out.println("34-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("n=");
        int n = scanner.nextInt();

        int[] a = new int[n];
        fillMatrix(a);
        show(a);

        int start = 0;
        int end = a.length - 1;
        while (start < end) {
            System.out.print(a[start++] + ", ");
            System.out.print(a[end--] + ", ");
        }
        if (a.length % 2 == 1) System.out.print(a[a.length / 2] + ", ");
    }

    static void show(int[] array) {
        for (int element : array) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }

    static void fillMatrix(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt() % 5 + 5;
        }
    }
}
