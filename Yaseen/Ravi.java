import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.List;

public class Ravi {
    public static void main(String[] args) {
       LinkedList<Integer> a = new LinkedList<>();
       ArrayList<Float> b= new ArrayList<>();
       Vector<String> c=new Vector<>();

       a.add(400);
       a.add(100);
       b.add(400.6f);
       c.add("HI");
       c.add("oopj");

       System.out.println("LinkedList: " + a);
       System.out.println("ArrayList: " + b);
       System.out.println("Vector: " + c);
    }
}