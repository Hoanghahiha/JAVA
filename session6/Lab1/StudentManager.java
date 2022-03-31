package session55.Lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentManager {
    public static Scanner scanner = new Scanner(System.in);
    public ArrayList<Student> studentList = new ArrayList<>();

    public void add() {
        String id = inputId();
        String name = inputName();
        String date = inputDateOfBirth();
        String address = inputAddress();
        float gpa = inputGpa();
        Student student = new Student(id, name, date, address, gpa);
        studentList.add(student);
    }


    public void edit(String id) {

    }

    public void delete(String id) {

    }


    public void sortStudentByName() {
        Collections.sort(studentList, new SortStudentByName());
    }


    public void sortStudentByGPA() {
        Collections.sort(studentList, new SortStudentByGPA());
    }


    public void show() {
        for (Student student : studentList) {
            System.out.format("%20s | ", student.getId());
            System.out.format("%20s | ", student.getName());
            System.out.format("%20s | ", student.getDateOfBirth());
            System.out.format("%20s | ", student.getAddress());
            System.out.format("%10.1f%n", student.getGpa());
        }
    }


    public String inputId() {
        System.out.print("Input student id: ");
        return scanner.nextLine();
    }


    public String inputName() {
        System.out.print("Input student name: ");
        return scanner.nextLine();
    }


    public String inputAddress() {
        System.out.print("Input student address: ");
        return scanner.nextLine();
    }


    public String inputDateOfBirth() {
        System.out.print("Input student Date: ");
        return scanner.nextLine();
    }


    private float inputGpa() {
        System.out.print("Input student gpa: ");
        return scanner.nextFloat();
    }

    // getter && setter

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
}
