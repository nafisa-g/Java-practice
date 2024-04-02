//import java.util.concurrent.SynchronousQueue;

class Table{
    synchronized void call(int x)
    {

        for(int i=1;i<10;i++){
            System.out.println(i*x);
            try{
                Thread.sleep(10);
            }catch(Exception e){}
        }
    }


class Thread1 extends Thread{
    Table t;
    public Thread1 (Table t)
    {
        this.t=t;
    }
}
public  synchronized void run()
{
    t.call(5);
}}

class Thread2 extends Thread{
    Table t;
    public Thread (table t)
    {
        this.t=t;
    }

public void run()
{
    t.call(100);

}
}






public class MBU {
    public static void main(String[] args) {
      Table t=new Table();
      Thread1 t1=new Thread1(t);
      Thread2 t2=new Thread2(t);

      t1.start();
      t1.start();
         
    }
}
