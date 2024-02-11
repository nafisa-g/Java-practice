class computer{
    public int add(int n1 ,int n2 )
    {
        return n1+n2;
    }
    public int add(int n1 ,int n2,int n3){
        return n1+n2+n3;

    }
    public int add(int n1 ,int n2 ,int n3,int n4){
        return n1+n2+n3+n4;
    }

}
public class Rought{
    public static void main(String[]args){
        computer com=new computer();
        int r1=com.add(3,4,5,7);
        System.out.println(r1);
    }
}