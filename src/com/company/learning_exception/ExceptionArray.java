package com.company.learning_exception;

import java.util.Random;
import java.util.Scanner;

public class ExceptionArray {
    public static void main(String[] args) {
        ExceptionArray exceptionArray = new ExceptionArray();
        int[] array = exceptionArray.creatRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter index:");
        int index = scanner.nextInt();
        try {
            System.out.println("Value of element at position: " + index + " is: " + array[index]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Out of Bounds");
        }
    }

    public int[] creatRandom() {
        Random random = new Random();
        int[] array = new int[10];
        System.out.println("Element of array: ");
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        return array;
    }
}
