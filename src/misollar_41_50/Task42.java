package misollar_41_50;

import java.util.Random;
import java.util.Scanner;

public class Task42 {

    /**
     * n ta elementdan tashkil topgan massiv berilgan.
     */
    public static void main(String[] args) {

        System.out.println("42-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Massiv elementlar soni n=");
        int n = scanner.nextInt();

        int[] array = new int[n];
        fillMatrix(array);
        System.out.print("Massiv: ");
        show(array);

        insertionSort(array);
        System.out.print("Massiv saralangan: ");
        show(array);
    }

    static void insertionSort(int[] array) {
        int current, holder;
        for (int i = 0; i < array.length; i++) {
            current = i;
            for (int j = 0; j <= i; j++) {
                if (array[current] < array[j]) {
                    holder = array[current];
                    array[current] = array[j];
                    array[j] = holder;
                }
            }
        }
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
