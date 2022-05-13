package Exam2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends StudentMethod{
    static List<Student> studentList;
    static Scanner scan;
    public static void main(String[] args) {
        studentList = new ArrayList<>();
        int c;
        scan = new Scanner(System.in);
        do {
            showMenu();
            c = scan.nextInt();
            switch(c) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    saveFile();
                    break;
                case 4:
                    readFile();
                    break;
                default:
                    System.out.println("Wrong choise!!! Please enter again.");
                    break;
            }
        } while (c != 0);
    }


}
