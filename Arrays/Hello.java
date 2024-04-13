
import java.util.Scanner;
import java.util.ArrayList;

public class Student {
    private int sno;
    private String sname; 
    private int tot;

    public void readValues() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sno, sname, total values");
        sno = sc.nextInt();
        sname = sc.next();
        tot = sc.nextInt();
    }

   
    public String toString() {
        return "sno: " + this.sno + ", sname: " + this.sname + ", total marks: " + this.tot;
    }

    public int getTotalMarks() {
        return this.tot;
    }
}

public class  Hello{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.readValues();
        Student s2 = new Student();
        s2.readValues();
        Student s3 = new Student();
        s3.readValues();
        Student s4 = new Student();
        s4.readValues();

        ArrayList<Student> L = new ArrayList<Student>();
        L.add(s1);
        L.add(s2);
        L.add(s3);
        L.add(s4);

        for (Student s : L) {
            if (s.getTotalMarks() > 300) {
                System.out.println(s.toString());
            }
        }
		
		
    }
}