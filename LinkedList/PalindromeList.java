package LinkedList;
public class PalindromeList extends SinglyLinkedList{
    public Node findMiddle(Node slow,Node fast)
    {
        //fast slow approach used to find mid node
        // fast.next!=null&&fast.next.next!=null can also be used but in then we need to pass mis.next as a parameter in reverse method
        while(fast!=null&& fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }return slow;
    }
    public Node reverseList(Node head)// reverse the list from particular node
    {
        if(head.next==null)
            return head;
        Node current=head,nextnode=null,prev=null;
        while(current!=null)
        {
            nextnode=current.next;
            current.next=prev;
            prev=current;
            current=nextnode;
        }return prev;

    }
    public boolean isPalindrome(Node head)
    {
        if(head==null||head.next==null)
            return true;
        Node slow=head,fast=head;
        Node mid=findMiddle(slow,fast);// Method call
        mid=reverseList(mid);//method call
        Node curr=head;
        while(mid!=null)
        {
            if(curr.data!=mid.data)
                return false;
            curr=curr.next;
            mid=mid.next;
        }
        return true;
    }
    public static void main(String[] args) {
        PalindromeList pl= new PalindromeList();
        pl.add(1);
        pl.add(2);
        pl.add(3);
        pl.add(2);
        pl.add(1);
        System.out.println(pl.isPalindrome(pl.head));

    }
}
