package LinkedList;
import java.util.LinkedList;
public class ReverseRecursive {
    static class ListNode
    {
        private ListNode next;
        private int data;
        public ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static ListNode reverse(ListNode head)
    {
        if(head==null||head.next==null)
            return head;
        ListNode newhead=reverse(head.next);
        ListNode temp=head.next;
        temp.next=head;
        head.next=null;
        return newhead;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode node2=new ListNode(2);head.next=node2;
        ListNode node3=new ListNode(3);node2.next=node3;
        ListNode node4=new ListNode(4);node3.next=node4;
        ListNode node5=new ListNode(5);node4.next=node5;
        ListNode newhead=reverse(head);
        while(newhead!=null)
        {
            System.out.println(newhead.data);
            newhead=newhead.next;
        }
    }

}
