package Queue;
import LinkedList.Node;
public class Queue_Implementation {
     public Node front,rear;
    public void enqueue(int data)
    {
        Node node= new Node(data);
        if(front ==null){front = rear =node;}
        else
        {
            rear.next=node;
            rear=node;
        }
    }
    public int dequeue()
    {int data=0;
        if(front==null){
            System.out.println("queue is empty");}
        else if(front==rear){data=front.data; front=rear=null;}
        else
        {
            data=front.data;
            front=front.next;
        }return  data;
    }
    public void display()
    {
        Node temp=front;
        if(front==null){System.out.println("queue is empty");}
        else
        {
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
    public void elementAtFront()
    {
        if(front!=null)
        {
            System.out.println(front.data);
        }else
        {
            System.out.println("queue is empty");
        }
    }
    public void elementAtRear()
    {
        if(front!=null)
        {
            System.out.println(rear.data);
        }else
        {
            System.out.println("queue is empty");
        }
    }
}



