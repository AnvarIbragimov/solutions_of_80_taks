package misollar_61_70;

import java.util.Random;
import java.util.Scanner;

public class Task69 {

    /**
     * n ta elementdan tashkil topgan massiv berilgan.
     */
    public static void main(String[] args) {

        System.out.println("69-masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("n=");
        int n = scanner.nextInt();

        int[] array = new int[n];
        fillArray(array);
        showArray(array);

        int[][] matrix = fillMatrix(array);
        sortByFirstColumn(matrix);
        showMatrix(matrix);

        int[] resultIndexs = sortArrayIndexs(matrix);
        showArray(resultIndexs);

    }

    static int[] sortArrayIndexs(int[][] matrix) {
        int[] result = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            result[i] = matrix[i][1];
        }
        return result;
    }

    static void sortByFirstColumn(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - 1 - i; j++) {
                if (matrix[j][0] > matrix[j + 1][0]) {
                    int[] holder = matrix[j];
                    matrix[j] = matrix[j + 1];
                    matrix[j + 1] = holder;
                }
            }
        }
    }

    static int[][] fillMatrix(int[] array) {
        int n = array.length;
        int[][] matrix = new int[n][2];

        for (int i = 0; i < n; i++) {
            matrix[i][0] = array[i];
            matrix[i][1] = i;
        }

        return matrix;
    }

    static void showMatrix(int[][] matrix) {
        for (int[] rowArray : matrix) {
            System.out.println(rowArray[0] + "->" + rowArray[1]);
        }
        System.out.println();
    }

    static void showArray(int[] array) {
        for (int element : array) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }

    static void fillArray(int[] array) {
        int n = array.length;

        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt() % 5 + 5;
        }
    }
}
