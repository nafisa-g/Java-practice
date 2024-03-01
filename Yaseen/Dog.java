public class Dog extends C {
  public static void main(String[] args) {
    C obj=new C();
    int r1=obj.add(1,2);
    int r2=obj.sub(1,2);
    int r3=obj.mui(1,2);
    int r4=obj.div(1,2);
    double r5=obj.power(1,2);
    System.out.println(r1+":"+r2+":"+r3+":"+r4+":"+r5);
  }
}
