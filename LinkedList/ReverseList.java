package LinkedList;
public class ReverseList extends SinglyLinkedList{
    public Node reverse(Node head)
    {
        if(head==null||head.next==null)
            return null;
        Node current=head,nextnode=null,prev=null;
        while(current!=null)
        {
            nextnode=current.next;
            current.next=prev;
            prev=current;
            current=nextnode;
        }return prev;

    }
    public static void main(String[] args) {
        ReverseList pl= new ReverseList();
        pl.add(1);
        pl.add(2);
        pl.add(3);
        pl.add(4);
        pl.add(5);
        pl.display();
        System.out.println("the reverse list is :");
        pl.head=pl.reverse(pl.head);
        pl.display();




    }
}
