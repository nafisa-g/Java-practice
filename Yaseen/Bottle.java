 //hashset,tree set,Linked hashset
 import java.util.HashMap;
 import java.util.Hashtable;
 import java.util.LinkedHashMap;
public class Bottle   {
    public static void main(String[] args) {
      HashMap<Integer,Integer>a=new HashMap<Integer,Integer>();
      a.put(21,43);
      a.put(2,5);

      a.put(22,795);
      a.put(32,95);


      System.out.println("HAshMap");
      System.out.println(a.toString());
      Hashtable <Integer,Integer> b=new  Hashtable<Integer,Integer>();
      a.put(2,4);
      a.put(2,5);

      a.put(22,795);
      a.put(32,95);
      System.out.println(" Hashtable");
      System.out.println(a.toString());
      LinkedHashMap<Integer,Integer> c=new LinkedHashMap<Integer,Integer>();
      a.put(21,43);
      a.put(2,5);

      a.put(22,795);
      a.put(32,95);
      System.out.println("LinkedHashMap");
      System.out.println(a.toString());
    }}