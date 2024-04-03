import java.util.Vector;
public class Glass {
    public static void main(String[] args) {
        Vector<Integer>a=new  Vector<Integer>();

       
        a.add(10);
        a.add(20);
        a.add(30);
        
        System.out.println("Elements of 0 index"+0);
        System.out.println("Elements of 1 index"+1);
        System.out.println("Elements of 2 index"+2);

        System.out.println("Elements in Vector:");
        for (int element : a) {
            System.out.println(a);
        }

        a.add(1,15);
        System.out.println("After adding  1 at index  15"+a);

       a.remove(1);
       System.out.println("After removing element at index 1: " + a);

        a.set(1,14);
        System.out.println("After updating element at index 1 to 14"+a);
    }
}
