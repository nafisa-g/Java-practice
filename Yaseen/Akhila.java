import java.util.LinkedList;
 public class Akhila{
  public static void main(String[] args) {
    LinkedList <Integer>a=new LinkedList <Integer>();
    a.add(12);
    a.add(23);
    a.add(34);

    System.out.println("Elements at 0 index"+0);
    System.out.println("Elements at 1 index"+1);
    System.out.println("Elements at 2 index"+2);

    System.out.println("elements");
    for(int i:a)
    {
      System.out.println(i);
    }
    a.addFirst(555);
    System.out.println("After adding 555 at the beginning" +a);

    a.addLast(452);
    System.out.println("After adding 452 at the end" + a);

    a.removeFirst();
    System.out.println("After removing the first element: "+a);

    a.removeLast();
    System.out.println("After removing the last element "+a);






  }




 }