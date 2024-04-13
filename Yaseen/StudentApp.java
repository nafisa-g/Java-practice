import java.util.*;

public class 
{
    private int Sno;
    private String name;
    private int tot;

    public void readValues(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sno,name,total Values");
        Sno=sc.nextInt();
        name=sc.next();
        tot=sc.nextInt();
    }
    public String toString(){
        return "Sno"+this.Sno+"name"+this.name+"total marks"+this.tot;
    }
    public int getTotalMarks(){
        return this.tot;
    }
    
}
public class StudentApp {
    public static void main(String[] args) {
        
    }
}