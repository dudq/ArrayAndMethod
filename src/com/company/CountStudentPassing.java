package com.company;

import java.util.Scanner;

public class CountStudentPassing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = declareSizeOfArray(scanner);
        int[] array = new int[size];
        putValueInArray(scanner, array);
        showNumberStudentPassing(array);
    }

    private static void showNumberStudentPassing(int[] array) {
        int count = 0;
        System.out.println("List of mark: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
            if (array[i] >= 5 && array[i] <= 10)
                count++;
        }
        System.out.println("\n The number of students passing the exam  is " + count);
    }

    private static void putValueInArray(Scanner scanner, int[] array) {
        for (int i = 0; i < array.length; i++) {
            do {
                System.out.print(" Enter a mark for student " + (i + 1) + ":");
                array[i] = scanner.nextInt();
                if (array[i] > 10 || array[i] < 0)
                    System.out.println("Invalid");
            } while (array[i] > 10 || array[i] < 0);
        }
    }

    private static int declareSizeOfArray(Scanner scanner) {
        int size;
        do {
            System.out.println("Enter size of students");
            size = scanner.nextInt();
            if (size < 1 || size > 10)
                System.out.println("Size should between 1 and 10");
        } while (size < 1 || size > 10);
        return size;
    }
}
