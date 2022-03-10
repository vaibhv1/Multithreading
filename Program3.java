package MultiThreading;
import java.util.*;
class SingleRun implements Runnable {
    public void run()
    {
        Thread t = Thread.currentThread();
        String s = t.getName();
        if(s.equals("ADD"))
        {
            add();
        }
        else
        {
            printNum();
        }
    }
    public void add()
    {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(x+y);
    }
    public void printNum()
    {
        System.out.println("PRINTING NUMBERS");
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println("Some problem occured");
            }
        }
    }
}
public class Program3 {
    public static void main(String[] args) {
        SingleRun s1 = new SingleRun();
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s1);
        t1.setName("ADD");
        t2.setName("PRINT");
        t1.start();
        t2.start();
    }
}
