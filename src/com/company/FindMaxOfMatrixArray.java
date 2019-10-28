package com.company;

import java.util.Scanner;

public class FindMaxOfMatrixArray {
    public static void main(String[] args) {
        int[][] array = getArray();
        showMaxOfMatrixArray(array);
    }

    private static void showMaxOfMatrixArray(int[][] array) {
        int maxValue = array[0][0];
        int xIndex = 0;
        int yIndex = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxValue) {
                    maxValue = array[i][j];
                    xIndex = i;
                    yIndex = j;
                }
            }
        }
        System.out.println("Max value of array is: " + maxValue + " position: [" + (xIndex + 1) + "," + (yIndex + 1) + "]");
    }

    private static int[][] getArray() {
        int xSize;
        int ySize;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter size of array lever 1");
            xSize = scanner.nextInt();
            if (xSize < 1 || xSize > 5)
                System.out.println("Size should between 1 and 5");
        } while (xSize < 1 | xSize > 5);
        do {
            System.out.println("Enter size of array lever 2");
            ySize = scanner.nextInt();
            if (ySize < 1 || ySize > 5)
                System.out.println("Size should between 1 and 5");
        } while (ySize < 1 | ySize > 5);

        int[][] array = new int[xSize][ySize];
        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                System.out.println("Enter value element [" + (i + 1) + "," + (j + 1) + "]");
                array[i][j] = scanner.nextInt();
            }
        }
        return array;
    }
}
