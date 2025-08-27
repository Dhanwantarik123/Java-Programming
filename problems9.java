import java.util.Scanner;

class Student {
    String name;
    int rollNo;

    void getDetails(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

class Marks extends Student {
    int[] marks = new int[5];

    void getMarks(int[] m) {
        for (int i = 0; i < 5; i++) {
            marks[i] = m[i];
        }
    }
}

class Result extends Marks {
    void displayResult() {
        int total = 0;
        for (int mark : marks) total += mark;
        double avg = total / 5.0;
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
        System.out.println("Total: " + total + ", Average: " + avg);
    }
}

public class problems9 {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        
        int numOfStudents = 5;
        Result[] students = new Result[numOfStudents];
        
        for (int i = 0; i < numOfStudents; i++) {
            students[i] = new Result();
            System.out.println("Enter name of student " + (i + 1) + ":");
            String name = obj.nextLine();
            System.out.println("Enter roll number of student " + (i + 1) + ":");
            int rollNo = obj.nextInt();
            obj.nextLine();
            students[i].getDetails(name, rollNo);
            
            System.out.println("Enter 5 marks for " + name + ":");
            int[] marks = new int[5];
            for (int j = 0; j < 5; j++) {
                marks[j] = obj.nextInt();
            }
            students[i].getMarks(marks);
            obj.nextLine();
            System.out.println();
        }
        
        for (Result student : students) {
            student.displayResult();
            System.out.println();
        }

        obj.close();
    }
}

