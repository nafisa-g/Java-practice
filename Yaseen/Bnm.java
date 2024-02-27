class Demo{
    String brand;
    int price;
    String name;
}
public class Bnm {
    public static void main(String[] args) {
        
    
     Demo obj1=new Demo();
     obj1.brand="Apple";
     obj1.price=30000;
     obj1.name="phone";

     Demo obj2=new Demo();
     obj2.brand="Iqoo";
     obj2.price=20000;
     obj2.name="Android phone";

     System.out.println(obj1.brand+": "+obj1.price+":"+obj1.name);
     System.out.println(obj2.brand+": "+obj2.price+":"+obj2.name);
}
}