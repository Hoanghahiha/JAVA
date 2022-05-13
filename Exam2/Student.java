package Exam2;

import java.util.Scanner;

public class Student {
    public String enrollId;
    public String firstName;
    public String lastName;
    public Integer age;

    public Student(String enrollId, String firstName, String lastName, Integer age) {
        this.enrollId = enrollId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Student() {

    }

    public String getEnrollId() {
        return enrollId;
    }

    public void setEnrollId(String enrollId) {
        this.enrollId = enrollId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void input() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Student's id: ");
        enrollId = scan.nextLine();

        System.out.println("Enter student's first name: ");
        firstName = scan.next();

        System.out.println("Enter student's first name: ");
        lastName = scan.nextLine();

        System.out.println("Enter student's age: ");
        age = scan.nextInt();
    }
    public void display() {
        System.out.println(this);
    }
    public String getFileLine() {
        return enrollId + "," + firstName + "," + lastName + "," + age + "," + "\n";
    }

    @Override
    public String toString() {
        return "Student{" +
                "enrollId='" + enrollId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
