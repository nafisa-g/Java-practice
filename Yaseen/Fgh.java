class Human{
   private  int  age;
    private  String name;

    public int Getage()
    {
        return age;
    }
    public void setage(int a)
    {
         age=a;
    }
    public String Getname()
    {
        return name;
    }
    public void setname(String n)
    {
         name=n;
    }

}

public class Fgh {
    public static void main(String[] args) {
        Human obj=new Human();
       obj.setage(24);
       obj.setname("Naseeb jan ");
        //obj1.name="naseb";
        System.out.println(obj.Getage()+":"+  obj.Getname());
    }
}
