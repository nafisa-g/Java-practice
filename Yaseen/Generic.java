class student <T,U>
{
    T name;
    U  m1,m2,m3;

    student (T  name , U m1, U m2, U m3 )
    {
        this.name=name;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }


public void print(){
    System.out.println(name);
    System.out.println(m1);
    System.out.println(m2); 
    System.out.println(m3);
}
}
 class Generic {
    public static void main(String[] args) {
        student<String,Integer>obj=new
        student<String,Integer>("Naseeb",12,32,21);
        obj.print();
    }
}
