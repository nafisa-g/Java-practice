package Nafisa;
public class World {
     public static void main(String[]args){
        int num1=1;
        int num2=2;

        int num3=3;
        int num4=4;

        
        
         boolean result=num1<num2 && num3<num4;
        System.out.println(result);

        boolean a=num1>num2 && num3>num4;
        System.out.println(a); 

        boolean b=num1<=num2 || num3>=num4;
        System.out.println(b);

        boolean c=num1>=num2;
        System.out.println(c); 

        boolean d=num1>num2 && num3 <=num4;
        System.out.println(!d); 


     }
    
}
