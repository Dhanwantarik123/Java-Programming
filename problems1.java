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

public class problems1{
    public static void main(String args[]) {
        Result r = new Result();
        r.getDetails("Dhanwantari", 101);
        r.getDetails("Dimpal", 102);
        r.getDetails("Dhara", 103);
        r.getDetails("Dhanno", 104);
        r.getDetails("Pari", 105);
        r.getMarks(new int[]{85, 90, 78, 88, 92});
        r.displayResult();
    }
}
