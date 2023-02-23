package misollar_41_50;

import java.util.Random;
import java.util.Scanner;

public class Task41 {

    /**
     * n ta elementdan tashkil topgan massiv berilgan.
     */
    public static void main(String[] args) {

        System.out.println("41-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Massiv elementlar soni n=");
        int n = scanner.nextInt();

        int[] array = new int[n];
        fillMatrix(array);
        System.out.print("Massiv: ");
        show(array);

        selectionSort(array);
        System.out.print("Massiv saralangan: ");
        show(array);
    }

    static void selectionSort(int[] array) {
        int current, min, minIndex = 0, holder;
        for (int i = 0; i < array.length; i++) {
            current = i;
            min = array[current];
            for (int j = i; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    minIndex = j;
                }
            }
            if (array[current] > array[minIndex]) {
                holder = array[current];
                array[current] = array[minIndex];
                array[minIndex] = holder;
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
