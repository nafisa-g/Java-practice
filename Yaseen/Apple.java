class Human{
    private int age;
    private String name;


    public Human(){
       // System.out.println("in constructor");
       age=12;
       name="nvjskdn";
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}

public class Apple {
    public static void main(String[] args) {
        Human obj=new Human();
        Human obj1=new Human();

        Human obj2=new Human();
       /*  obj.setName("jlkn");

        obj.setAge(56);*/

        System.out.println(obj.getName()+":"+obj.getAge());
    }
}
