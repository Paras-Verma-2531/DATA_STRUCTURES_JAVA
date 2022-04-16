package Queue;
import  LinkedList.Node;
public class Deque_Implementation extends Queue_Implementation{
    public void addAtFront(int data)
    {
        Node node = new Node(data);
        if(front ==null){front=rear=node;}
        else
        {
            node.next=front;
            front=node;
        }
    }
    public int deleteFromEnd()
    {
        int data=0;
        if(front!=null)
        {
            Node temp=front;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            data=temp.next.data;
            temp.next=null;

        }else{System.out.println("Deque is empty");}
        return  data;
    }

}
