package LinkedList;
public class circularLinkedList {
    Node head,tail,temp;
    Node current,nextnode,prev;
    public void addAtBeg(int data)
    {
        Node node=new Node(data);
        if(head==null){head=tail=node;}
        else
        {
            node.next=head;
            head=node;
        }tail.next=head;
    }
    public void addAtEnd(int data)
    {
        Node node =new Node(data);
        if(head==null){head=tail=node;}
        else{
            tail.next=node;
            tail=node;
        }tail.next=head;
    }
    public void display()
    {
        if(head==null){
            System.out.println("list is empty");}
        else
        {
            temp=head;
            while(temp.next!=head)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
    }
    public void reverse()
    {
        if(head==null){
            System.out.println("list is empty");}
        else if(head.next==head)
        {
            System.out.println(head.data);
        }
        else
        {
            current=head;
            nextnode=current.next;
            while(current!=tail)
            {
                prev=current;
                current=nextnode;
                nextnode=current.next;
                current.next=prev;
            }nextnode.next=tail;
            head=tail;
            tail=nextnode;
        }
    }
}
