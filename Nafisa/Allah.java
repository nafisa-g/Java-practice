package Nafisa;


class Human{
       private int Age=20;
       private  String Name="Mohammad";
       
        public int getAge()
       {
        return Age;
       }
       public String getName()
       {
        return Name;
       }
    }
       public class Allah{
        public static void main(String[] args) {

            Human obj=new Human();
            System.out.println(obj.getAge()+" : "+obj.getName());
       }
    }




  