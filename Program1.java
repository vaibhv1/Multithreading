package MultiThreading;
import java.util.*;
class x1 extends Thread{

    public void run()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Addition has started");
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(x+y);
    }
}
class x2 extends Thread
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
public class Program1 {
    public static void main(String[] args) {
    x1 x = new x1();
    x2 y = new x2();
    x.start();
    y.start();
    }
}
