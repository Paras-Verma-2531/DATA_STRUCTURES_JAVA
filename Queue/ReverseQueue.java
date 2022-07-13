package Queue;
import java.util.ArrayDeque;
import java.util.Queue;
public class ReverseQueue {
    public static void reverse(Queue<Integer>queue)// method to reverse a Queue
    {
        if(queue.isEmpty())
            return;
        int x=queue.poll();
        reverse(queue);
        queue.offer(x);
    }
    public static void main(String[] args) {
        Queue<Integer>queue=new ArrayDeque<>();
        int i=1;
        while(i<=5)
            queue.offer(i++);
        System.out.println(queue);// before reverse method
        reverse(queue);
        System.out.println(queue);//after reverse method
    }
}
