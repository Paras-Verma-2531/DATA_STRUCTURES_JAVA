package LinkedList;
// Floyd's Cycle detection Algorithm
public class CycleStart {
    public Node detectCycle(Node head)
    {// return the address where fast and slow meet
        Node slow=head,fast=head;
        while(fast.next!=null&&fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return slow;
        }return null;
    }
    public Node FindElement(Node head)
    {
        if(head==null)
            return null;
        if(head.next==null)
            return head;
        Node temp=detectCycle(head);
        Node start=head;
        while(start!=temp)
        {
            start=start.next;
            temp=temp.next;
        }return start;// where the cycle begins
    }
    public static void main(String[] args) {
        Node head= new Node(1);
        Node node1=new Node(2);
        Node node2=new Node(3);
        Node node3=new Node(4);
        Node node4=new Node(5);
        head.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node3;
        System.out.println(new CycleStart().FindElement(head).data);
    }
}
