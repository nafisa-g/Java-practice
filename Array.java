public class Array 
{
    public static void main(String[] args) {
        int num[]={1,2,3,4,5};
        System.out.println(num[0]);

        int num1[]={4,5,6,7};
        System.out.println(num[3]);

        int num3[]={7,8,9};
        num[0]=1;
        System.out.println(num3[0]);

        int  num4[]=new int [4];
        num[0]=1;
        num[1]=2;
        num[2]=3;
        num[3]=4;
        num[4]=5; 
        System.out.println(num[0]);
         System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);
        System.out.println(num[4]); 
    }
    
}
