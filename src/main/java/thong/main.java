/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thong;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagement sm = new StudentManagement();

        while (true) {
            System.out.println("\n1. Add Student\n2. Edit Student\n3. Delete Student\n4. Search Student\n5. Display Students\n6. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Marks: ");
                    double marks = scanner.nextDouble();
                    sm.addStudent(new Student(id, name, marks));
                }
                case 2 -> {
                    System.out.print("Enter ID of student to edit: ");
                    int editId = scanner.nextInt();
                    System.out.print("Enter new Name: ");
                    String newName = scanner.next();
                    System.out.print("Enter new Marks: ");
                    double newMarks = scanner.nextDouble();
                    sm.editStudent(editId, newName, newMarks);
                }
                case 3 -> {
                    System.out.print("Enter ID of student to delete: ");
                    int deleteId = scanner.nextInt();
                    sm.deleteStudent(deleteId);
                }
                case 4 -> {
                    System.out.print("Enter ID of student to search: ");
                    int searchId = scanner.nextInt();
                    sm.searchStudent(searchId);
                }
                case 5 -> sm.displayStudents();
                case 6 -> {
                    scanner.close();
                    System.exit(0);
                }
            }
        }
    }
}


