import java.util.Scanner;
import java.util.ArrayList;

public class Student1 {
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

