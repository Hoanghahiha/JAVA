package Exam2;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import static Exam2.Main.studentList;

public class StudentMethod {
    public static void showMenu() {
        System.out.println("/****************************************/");
        System.out.println("1. Add student");
        System.out.println("2. Show students");
        System.out.println("3. Save into student.txt");
        System.out.println("4. Read student.txt and show");
        System.out.println("0. Exit");
        System.out.println("/****************************************/");
        System.out.println("Your choice: ");
    }
    public static void input() {
        Student std = new Student();
        std.input();

        studentList.add(std);
    }
    static void display() {
        System.out.println("***Students Detail Information***");
        studentList.forEach(student -> {
            student.display();
        });
    }
    static void saveFile() {
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("students.dat");

            for (Student student : studentList) {
                String line = student.getFileLine();
                byte[] data = line.getBytes("utf8");

                fos.write(data);
            }
            System.out.println("Save success!!!");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(fos != null) {
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    static void readFile() {

        FileInputStream fis = null;
        StringBuilder builder = new StringBuilder();
        try {
            fis = new FileInputStream("students.dat");

            int code;
            while((code = fis.read()) != -1) {
                builder.append((char) code);
            }
            System.out.println(builder.toString());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(fis != null) {
                try {
                    fis.close();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }


    }
}
