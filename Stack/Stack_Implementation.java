package Stack;
import LinkedList.Node;
public class Stack_Implementation {
    Node head;
    public void push(int data) {
           Node node =new Node(data);
           if(head==null){head=node;}
           else
           {
               node.next=head;
               head=node;
           }
    }
    public int pop() {
        if(head==null){
            System.out.println("stack is empty");}
        else
        {
            int data=head.data;
            head=head.next;
            return data;
        }return -1;
    }
    public int peek() {
        if(head==null){
            System.out.println("stack is empty");}
        else {
            int data = head.data;
            return data;
        }
        return -1;
    }
}
