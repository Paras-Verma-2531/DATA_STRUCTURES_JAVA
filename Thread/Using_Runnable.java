package Thread;

public class Using_Runnable {
    public static void main(String[] args) {
        thread1 bullet1= new thread1();// bullet and gun are both useless without each other
        thread2 bullet2=new thread2();
        Thread gun1= new Thread(bullet1);
        Thread gun2= new Thread(bullet2);// loading bullet in gun
        gun1.start();
        gun2.start();

    }

}
class thread1 implements Runnable {
    public void run() {
        while (true) {
            System.out.println("I am function 1");
        }
    }
}
class thread2 implements Runnable {
    public void run() {
        while (true) {
            System.out.println("I am function 2");
        }
    }
}
