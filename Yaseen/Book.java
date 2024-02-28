import  java .util.Scanner;
public class Book {
    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
     System.out.println("Enter two numbers");
    String str=q.nextLine();
       String rev="  ";

    for(int i=0;i<str.length();i++)
    rev=str.charAt(i)+rev;
   System.out.println(rev);


      if (rev.equals(str));
    System.out.println("palindrome");
    else
  {
    System.out.println(" NOt  palindrome");
  }
   



}
    }
    

