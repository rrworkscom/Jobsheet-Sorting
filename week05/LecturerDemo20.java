package week05;

import java.util.Scanner;

public class LecturerDemo20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id, name;
        Boolean gender;
        int age;
        int size = 10;

        LecturerData20 lecturerData = new LecturerData20(10);

        for (int i = 0; i < size; i++) {
            System.out.println("Lecturer #" + (i + 1));

            System.out.print("ID: ");
            id = sc.nextLine();
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Gender (true = M, false = F): ");
            gender = Boolean.parseBoolean(sc.nextLine());
            System.out.print("Age: ");
            age = Integer.parseInt(sc.nextLine());

            lecturerData.add(new Lecturer20(id, name, gender, age));
        }

        System.out.println("Original lecturer list: ");
        lecturerData.print();

        lecturerData.bubbleSort();
        System.out.println("Sorted lecturer list (by GPA, ascending) using Bubble Sort:");
        lecturerData.print();

        lecturerData.selectionSort();
        System.out.println("Sorted lecturer list (by GPA, descending) using Selection Sort:");
        lecturerData.print();

    }

}

