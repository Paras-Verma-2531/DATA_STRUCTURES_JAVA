package LinkedList;
public class DetectCycle {
    public boolean isCyclePresent(Node head)
    {
        if(head==null||head.next==null)
            return false;
        Node fast=head,slow=head;
        while(fast.next!=null&&fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
                return true;
        }return false;
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
        System.out.println(new DetectCycle().isCyclePresent(head));

    }
}
