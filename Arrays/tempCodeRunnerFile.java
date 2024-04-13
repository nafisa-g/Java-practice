Multithreading using Runnable Interface
   
   class A implements Runnable{
    public void run(){
        for (int i=1;i<=5;i++)
        {
            System.out.println("Hi");
        }
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            
        }
    }}
   
    class B implements Runnable{
        public void run(){
            for (int i=1;i<=5;i++)
            {
                System.out.println("Hi");
            }
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                
            }
        }}

public class Mbu{
    public static void main(String []args){
        Runnable obj1=new A();
        Runnable obj2=new B();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        try{ Thread.sleep(1000);
        }catch(Exception e ){

        }
        t2.start();

    }}