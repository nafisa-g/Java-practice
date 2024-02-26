class Student{
     String name;
     int marks;
     int rollno;
}
public class Noor {
    public static void main(String[] args) {
      Student obj1=new Student();
      obj1.name="Yaseen";
      obj1.marks=96;
      obj1.rollno=1;

      Student obj2=new Student();
      obj2.name="Yahid bro";
      obj2.marks=95;
      obj2.rollno=2;

      Student obj3=new Student();
      obj3.name="Noor bro";
      obj3.marks=96;
      obj3.rollno=3;
      
      System.out.println(obj1.name+":"+obj1.marks+":"+obj1.rollno);

      Student students[]=new Student[3];
      students[0]=obj1;
      students[1]=obj2;
      students[2]=obj3;

      for(int i=0;i<students.length;i++)
      {
        System.out.println( students[i].name+":"+students[i].marks+":"+students[i].rollno);
      }
}



    }