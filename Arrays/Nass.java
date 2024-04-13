import java.util.Scanner;
import java.util.ArrayList;

public class Nass {
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

public class  {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.readValues();
        Student1 s2 = new Student1();
        s2.readValues();
        Student1 s3 = new Student1();
        s3.readValues();
        Student1 s4 = new Student1();
        s4.readValues();

        ArrayList<Student1> L = new ArrayList<Student1>();
        L.add(s1);
        L.add(s2);
        L.add(s3);
        L.add(s4);

        for (Student1 s : L) {
            if (s.getTotalMarks() > 300) {
                System.out.println(s.toString());
            }
        }
		
		
    }
}

