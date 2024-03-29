package DSA_PRAC.linkedlist;
public class LL {
    private static ListNode head,tail;
    private int size;
    public LL()
    {
        this.size=0;
    }
    // Inner class for user defined datatype i,e Node:
     private class ListNode {
        private int data;
         private ListNode next;
//         parameterized constructor
        public ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
            size++;
        }
        public ListNode(int data) {
            this.data = data;
            size++;
        }
    }
    private ListNode get(int index)
    {
        int i=1;
        ListNode temp=head;
        while(i<index){temp=temp.next;i++;}
        return temp;
    }
    public void insertAtFirst(int val)
    {
        ListNode node=new ListNode(val);
        node.next=head;
        head=node;
        if(tail==null)tail=head;
    }
    //if done without tail pointer, it will take O(N)
    public void insertAtLast(int val)
    {
        if(tail==null){insertAtFirst(val);return;}
        ListNode node=new ListNode(val);
        tail.next=node;
        tail=node;
    }
    public int deleteFirst()
    {
        if(head==null)return -1;
        if(head==tail)tail=null;
        int data=head.data;
        head=head.next;
        size--;
        return data;
    }
    public int deleteLast()
    {
        ListNode temp=head;int data=0;
        if(head==null)return -1;
        if(temp.next==null){data=temp.data;tail=head=null;size--;return data;}
        ListNode secondLast=get(size-1);
        data=secondLast.next.data;
        secondLast.next=null;
        tail=secondLast;
        size--;
        return data;
    }
    public int delete(int pos)
    {
        if(pos==1)return deleteFirst();
        if(pos==size)return  deleteLast();
        if(pos<1&&pos>size)return -1;
        ListNode temp=get(pos-1);
        int data=temp.next.data;
        temp.next=temp.next.next;
        size--;
        return data;
    }
    public void insert(int val,int pos)
    {
        if(pos==1){insertAtFirst(val);return;}
        if(pos==size+1){insertAtLast(val);return;}
        if(pos>1&&pos<=size)
        {
           ListNode temp=get(pos-1);
            temp.next= new ListNode(val,temp.next);
            return;
        }
        System.out.println("Invalid position");
    }
    public void display()
    {
        ListNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }System.out.println("END");
    }
    public static ListNode getHead() {
        return head;
    }
      /*private void helper(Node head, int val, int ind) {

        Approach 1: without returning the node [ only runs till ind-1]
        if(ind==1)
            head.next= new Node(val,head.next);
        else helper(head.next,val,ind-1);
        }
        */
    public void insertUsingRec(int val,int ind)
    {
        //helper( head,val,ind);
        head=insertUsingRec(head,val,ind);
    }
    private ListNode insertUsingRec(ListNode head, int val, int ind) {
        if(ind==0)
            return new ListNode(val,head.next);//newly created node is returned to it's caller
        else {
            head.next=insertUsingRec(head.next, val, ind - 1);// change would ony occur at ind node[ head.next=node]
            //else will return the same head; i,e caller
            return head;
        }
    }
    //Questions:: find Middle of the List
    public ListNode findMiddle(ListNode head)
    {
        ListNode fast=head,slow=null;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow==null?head:slow.next;
            fast=fast.next.next;
        }
        ListNode mid=slow.next;
        slow.next=null;
        return mid;
    }
    //mergeSort on LinkedList
    public ListNode mergeSort(ListNode head)
    {
        if(head==null||head.next==null)return head;
        ListNode mid=findMiddle(head);//finds the middle
        ListNode left=mergeSort(head);
        ListNode right=mergeSort(mid);
        return merge(left,right);
    }
    public ListNode merge(ListNode list1, ListNode list2)
    {
        ListNode newhead=new ListNode(-1);
        ListNode temp=newhead;
        while(list1!=null&&list2!=null)
        {
            if(list1.data<=list2.data){temp.next=list1;list1=list1.next;}
            else {temp.next=list2;list2=list2.next;}
            temp=temp.next;
            temp.next=list1!=null?list1:list2;
        }return newhead.next;
    }
    //in-place reversal of LinkedList
    public ListNode reverseList(ListNode head,int num) {
        if(head==null||head.next==null)return head;
        ListNode prev=null,curr=head,nextnode=head;
        while(curr!=null)
        {
            nextnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }return prev;
    }
    //recursive reversal of LinkedList
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode newhead=reverseList(head.next);
        ListNode newnode=head.next;
        newnode.next=head;
        head.next=null;
        return newhead;
    }
    public static void main(String[] args) {
        LL list=new LL();
        int i=5;
        //while (i>=1)list.insertAtFirst(i--);
        list.insertAtLast(22);
        list.insertAtLast(2);
        list.insertAtLast(21);
        list.insertAtLast(121);
        list.insertAtLast(112);
        //System.out.println(list.findMiddle(head).data);
        head=list.mergeSort(head);
        head=list.reverseList(head);
        list.display();

    }
}
