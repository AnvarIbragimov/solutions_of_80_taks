package misollar_31_40;

import java.util.Random;
import java.util.Scanner;

public class Task40 {

    /**
     * n ta elementdan tashkil topgan massiv berilgan.
     */
    public static void main(String[] args) {

        System.out.println("40-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Massiv elementlar soni n=");
        int n = scanner.nextInt();

        int[] array = new int[n];
        fillMatrix(array);
        System.out.print("Massiv: ");
        show(array);

        bubbleSort(array);
        System.out.print("Massiv saralangan: ");
        show(array);
    }

    static void bubbleSort(int[] array) {
        int current, next, holder;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                current = j;
                next = j + 1;
                if (array[current] > array[next]) {
                    holder = array[current];
                    array[current] = array[next];
                    array[next] = holder;
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
