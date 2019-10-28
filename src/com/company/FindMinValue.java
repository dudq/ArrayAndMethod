package com.company;

import java.util.Scanner;

public class FindMinValue {
    public static void main(String[] args) {
        //enter size of array
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the size:");
            size = scanner.nextInt();
            if (size < 1 || size > 10)
                System.out.println("Size should not over 10 and under 1");
        } while (size < 1 || size > 10);
        // enter elements of array
        int[] array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter the element " + (i + 1));
            array[i] = scanner.nextInt();
            i++;
        }
        //show array
        System.out.printf("%-20s%s", "Element in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        //show min of array
        int indexMin = indexMinValue(array);
        System.out.println("Min element of array is: " + array[indexMin] + " position: " + (indexMin + 1));
    }

    private static int indexMinValue(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
