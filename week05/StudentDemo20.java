package week05;

import java.util.Scanner;

public class StudentDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nim, name, studentClass;
        double gpa; 

        System.out.print("Input data size: ");
        int size = Integer.parseInt(sc.nextLine());

        TopStudent20 topStudents = new TopStudent20(size);

        for (int i = 0; i < size; i++) {
        System.out.println("Input data for student #" + (i + 1));
        System.out.print("NIM: ");
        nim =  sc.nextLine();
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Student's class: ");
        studentClass = sc.nextLine();
        System.out.print("GPA: ");
        gpa = Double.parseDouble(sc.nextLine());

        topStudents.add(new Student20(nim, name, studentClass, gpa));
        }

        System.out.println("Original student list: ");
        topStudents.print();

        topStudents.insertionSort();
        System.out.println("Sorted student list (by GPA, ascending) using Insertion Sort:");
        topStudents.print();
        

    }
}