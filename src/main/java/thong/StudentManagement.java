/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thong;



import java.util.Stack;
/**
 *
 * @author Admin
 */
public class StudentManagement {
    private final Stack<Student> studentStack = new Stack<>();

    public void addStudent(Student student) {
        studentStack.push(student);
    }

    public void editStudent(int id, String newName, double newMarks) {
        Stack<Student> tempStack = new Stack<>();
        boolean found = false;

        while (!studentStack.isEmpty()) {
            Student student = studentStack.pop();
            if (student.id == id) {
                student.name = newName;
                student.marks = newMarks;
                student.rank = student.determineRank(newMarks);
                found = true;
            }
            tempStack.push(student);
        }

        while (!tempStack.isEmpty()) {
            studentStack.push(tempStack.pop());
        }

        if (!found) {
            System.out.println("Student not found!");
        }
    }

    public void deleteStudent(int id) {
        Stack<Student> tempStack = new Stack<>();
        boolean found = false;

        while (!studentStack.isEmpty()) {
            Student student = studentStack.pop();
            if (student.id == id) {
                found = true;
                continue; // Skip this student
            }
            tempStack.push(student);
        }

        while (!tempStack.isEmpty()) {
            studentStack.push(tempStack.pop());
        }

        if (found) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found!");
        }
    }

    public void searchStudent(int id) {
        Stack<Student> tempStack = new Stack<>();
        boolean found = false;

        while (!studentStack.isEmpty()) {
            Student student = studentStack.pop();
            if (student.id == id) {
                found = true;
                System.out.println(student);
            }
            tempStack.push(student);
        }

        while (!tempStack.isEmpty()) {
            studentStack.push(tempStack.pop());
        }

        if (!found) {
            System.out.println("Student not found!");
        }
    }

    public void displayStudents() {
        Stack<Student> tempStack = new Stack<>();

        while (!studentStack.isEmpty()) {
            Student student = studentStack.pop();
            System.out.println(student);
            tempStack.push(student);
        }

        while (!tempStack.isEmpty()) {
            studentStack.push(tempStack.pop());
        }
    }
  
}