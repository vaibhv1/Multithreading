package MultiThreading;
import java.util.*;
class Add implements Runnable
{
    public void run()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Addition has started");
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(x+y);
    }
}

class Printing implements Runnable
{
    public void run() {
        System.out.println("Numbers getting printed");
        for (int i = 1; i < 10; i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(4000);
            }
            catch(Exception e)
            {
                System.out.println("Some problem occured");
            }
        }
        System.out.println("Number printing stopped");
    }
}
public class Program2 {
    public static void main(String[] args) {
        Add a = new Add();
        Printing p = new Printing();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(p);
        t1.start();
        t2.start();
    }
}
