class Demo{
    String brand;
    int price;
     static String name;


    static {
        name="phome";
        System.out.println("in static block");
    }
    public Demo(){
        price=12;
        brand="mvkn";
        System.out.println("In constructor ");

        public void show()
        {
            System.out.println (brand);

        }
    }
   }


public class Asd {
    public static void main(String[] args) {
        
       
                
            
             Demo obj1=new Demo();
             obj1.brand="Apple";
             obj1.price=30000;
            Demo .name="phone";
        
             Demo obj2=new Demo();
             
             obj2.brand="Iqoo";
             obj2.price=20000;
             obj2.name="Android phone"; 
        
           System.out.println(obj1.brand+": "+obj1.price+":"+obj1.name);
             System.out.println(obj2.brand+": "+obj2.price+":"+obj2.name);
        }
        
}
