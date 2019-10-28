package com.company;

import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        //enter size of array
        int size = 4;
        Scanner scanner = new Scanner(System.in);
//        do {
//            System.out.println("Enter the size:");
//            size = scanner.nextInt();
//            if (size < 1 || size > 10)
//                System.out.println("Size should not over 10 and under 1");
//        } while (size < 1 || size > 10);
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
        //Enter value and index replace
        int replaceValue;
        int replaceIndex;
        System.out.println("\n");
        do {
            System.out.println("Enter index replace: ");
            replaceIndex = scanner.nextInt();
            if (replaceIndex < 1 || replaceIndex > size + 1) {
                System.out.println("Index should between 1 and 5");
            }
        } while (replaceIndex < 1 || replaceIndex > size + 1);
        System.out.println("Enter value replace");
        replaceValue = scanner.nextInt();
        //push replace value into array
        for (int j = size - 1; j > (replaceIndex - 1); j--) {
            array[j] = array[j - 1];
        }
        array[replaceIndex - 1] = replaceValue;
        //show new array
        System.out.printf("%-20s%s", "Element in new array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");

        }
    }
}
