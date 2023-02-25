package Misollar_51_60;

import java.util.Random;
import java.util.Scanner;

public class Task52_53 {

    /**
     * n ta elementdan tashkil topgan massiv berilgan.
     */
    public static void main(String[] args) {

        System.out.println("52 va 53 masala");

        Scanner scanner = new Scanner(System.in);

        System.out.print("MxN matrissaning m=");
        int m = scanner.nextInt();

        System.out.print("MxN matrissaning n=");
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];
        fillMatrix(matrix);
        show(matrix);

        int[][] matrixAfterRemoveColumn = removeMinElementColumn52(matrix);

        System.out.println("Result52:");
        show(matrixAfterRemoveColumn);

        int[][] matrixAfterRemoveRow = removeMinElementColumn53(matrix);

        System.out.println("Result53:");
        show(matrixAfterRemoveRow);
    }

    static int[][] removeMinElementColumn53(int[][] matrix) {
        if (matrix.length == 0) return new int[][]{};

        int row = matrix.length;
        int column = matrix[0].length;

        int[][] result = new int[row - 1][column];

        int min = Integer.MAX_VALUE;
        int minRowIndex = 0;

        // find min element row index
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                    minRowIndex = i;
                }
            }
        }

        // fill result matrix
        int mover = 0;
        for (int i = 0; i < row; i++) {
            if (minRowIndex != i) {
                for (int j = 0; j < column; j++) {
                    result[mover][j] = matrix[i][j];
                }
                mover++;
            }
        }

        return result;
    }

    static int[][] removeMinElementColumn52(int[][] matrix) {
        if (matrix.length == 0) return new int[][]{};

        int row = matrix.length;
        int column = matrix[0].length;

        int[][] result = new int[row][column - 1];

        int min = Integer.MAX_VALUE;
        int minColumnIndex = 0;

        // find min element column index
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                    minColumnIndex = j;
                }
            }
        }

        // fill result matrix
        int mover = 0;
        for (int i = 0; i < row; i++) {
            mover = 0;
            for (int j = 0; j < column; j++) {
                if (minColumnIndex != j) {
                    result[i][mover++] = matrix[i][j];
                }
            }
        }

        return result;
    }

    static void show(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + ", ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void fillMatrix(int[][] matrix) {

        Random rand = new Random();

        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt(9);
            }
        }
    }
}
