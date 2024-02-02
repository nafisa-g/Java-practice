
        //methods in java
        class computer{        //class
            public int add (int n1 ,int n2,int n3) //Method
            {
                return n1+n2+n3;
            }
            public int add(int n1 ,int n2)
            {
                return n1+n2;
            }

        }
        public class Book 
        {
            public static void main(String[]args){

                computer comp =new computer();     //object 
                int r1=comp.add(3,4);      //Calling 
                System.out.println(r1);



    }
    
}
