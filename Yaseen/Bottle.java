  import java.util.HashSet;
 // import java.util.Set;


public class Bottle {
    public static void main(String[] args) {
      HashSet<Integer>a=new HashSet<Integer>();
      a.add(10);
      a.add(20);
      a.add(30);
      a.add(30);
      a.add(10);
      

      

      System.out.println("Elements");
      for(int i:a)
      {
        System.out.println(a);
      }

      System.out.println(a.contains(23));  //t or f
      System.out.println(a.contains(10));  //t or f

System.out.println(a.size());
      a.clear();
    System.out.println(a);
     
    System.out.println(a.size());





    }
}
