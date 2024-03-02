class A{
  public int add(int i,int j){
    return i+j;
  }
 public int sub(int i,int j){
    return i-j;

  }
}
  class B extends A{
    public int multi(int i,int j)
    {
      return i*j;
    }

       public int div(int i,int j)
    {
      return i/j;
    }
  }



public class Dog extends C {
  public static void main(String[] args) {
    C obj=new C();
    int r1=obj.add(1,2);
    int r2=obj.sub(1,2);
    int r3=obj.multi(1,2);
    int r4=obj.div(1,2);
    
    System.out.println(r1+":"+r2+":"+r3+":"+r4);
  }
}
