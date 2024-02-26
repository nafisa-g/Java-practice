package Nafisa;
class Human{
    private int age;
    private String Name;

    public Human()
    {
        System.out.println("nbjk bxfjkb");
    }

    public int getage()
    {
        return age;
    }
    public void setage(int age){
        this.age=age;
    }
    public String getname()
    {
        return name;
    }
     public void setname(int name){
        this.name=name;
    } 
}



public class Lang {
    public static void main(String[] args) {
        Human obj=new Human();
        System.out.println(obj.getage()+" :"+obj.getname());
        obj.setage(30);
        obj.setname("Yaseen");
     //   System.out.println(obj.getage+" :"+obj.getname);

    }
}
