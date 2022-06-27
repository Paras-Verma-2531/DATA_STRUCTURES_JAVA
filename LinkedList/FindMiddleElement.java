package LinkedList;
public class FindMiddleElement extends SinglyLinkedList{
    public Node findMiddle(Node head)
    {
        // fast and slow approach is used to fine middle element of LinkedList::
       if(head==null)
           return null;
       if(head.next==null)
           return head;
       Node slow=head,fast=head;
       while(fast.next!=null&&fast.next.next!=null)
       {
           slow=slow.next;
           fast=fast.next.next;
       }return slow;
    }
    public static void main(String[] args) {
        FindMiddleElement fm= new FindMiddleElement();
        int i=1;
        while(i<=10)
        {
            fm.add(i);i++;
        }
        System.out.println(fm.findMiddle(fm.head).data);//prints mid element data


    }
}
