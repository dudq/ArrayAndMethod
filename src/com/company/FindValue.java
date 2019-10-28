package com.company;

import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isExist =false;
        String[] students = {"Quy", "Tung", "Hoang", "Hau", "Duc", "Ngia", "Chau"};
        System.out.println("Enter a name's student: ");
        String input_name = scanner.nextLine();
        for (int i=0;i<students.length;i++){
            if (students[i].equals(input_name)){
                System.out.println("Position of the student in the list " + input_name+" is: "+ (i+1));
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.println("Not found " + input_name + " in the list");
    }
}
