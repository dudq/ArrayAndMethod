package com.company;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(" Enter the size:");
            size = scanner.nextInt();
            if (size < 1 || size > 10)
                System.out.println("Size should not over 10 and under 1");
        } while (size < 1 || size > 10);
        int[] array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element " + (i + 1));
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Element in array: ", "");
        for (int j = 0; j < array.length; j++)
            System.out.print(array[j] + "\t");
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[array.length - 1 - j];
            array[array.length - 1 - j] = temp;
        }
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++)
            System.out.print(array[j] + "\t");

    }
}
