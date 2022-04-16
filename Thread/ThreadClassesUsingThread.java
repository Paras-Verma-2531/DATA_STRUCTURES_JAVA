package Thread;
public class ThreadClassesUsingThread {
    public static void main(String[] args) {
        Mythread my= new Mythread();
        my.start();
        Mythread2 my2= new Mythread2();
        my2.start();
        my.setPriority(Thread.MIN_PRIORITY);
        Mythread3 my3= new Mythread3();
        my3.start();
        my.setPriority(Thread.MAX_PRIORITY);

    }
}
class Mythread extends Thread
{
    public void run()
    {
        while(true)
        {
            System.out.println("in the first thread function!!");
        }
    }
}
class Mythread2 extends Thread
{
    public void run()
    {
        while(true)
        {
            System.out.println("in the second thread function!");
        }
    }
}
class Mythread3 extends Thread
{
    public void run()
    {
        while(true)
        {
            System.out.println("in the third thread function!");
        }
    }
}
