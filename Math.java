class Human{
       private  int Age;
       private String Name ;

     public int getAge()
     {
        return Age;
     }
     public void setAge(int age)
     {
        this.Age =Age;
     }
     public String getName()
     { 
        return Name;
     }
     public void setName( String Name)
     {
        this.Name =Name;
     }
     
    
}
public class Math
{
    public static void main (String []args){
        Human obj =new Human();
        obj.setAge(18);
        obj.setName("Yaseen");

        System.out.println(obj.getAge()+":"+obj.getName());
    }
}
