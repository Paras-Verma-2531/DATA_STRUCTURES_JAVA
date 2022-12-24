package DSA_PRAC.linkedlist;
public class LL {
    private Node head,tail;
    private int size;
    public LL()
    {
        this.size=0;
    }
    private class Node {
        private int data;
        private Node next;
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
            size++;
        }
        public Node(int data) {
            this.data = data;
            size++;
        }
    }
    private Node get(int index)
    {
        int i=1;Node temp=head;
        while(i<index){temp=temp.next;i++;}
        return temp;
    }
    public void insertAtFirst(int val)
    {
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null)tail=head;
    }
    public void insertAtLast(int val)
    {
        if(tail==null){insertAtFirst(val);return;}
        Node node=new Node(val);
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
        Node temp=head;int data=0;
        if(head==null)return -1;
        if(temp.next==null){data=temp.data;tail=head=null;size--;return data;}
        Node secondLast=get(size-1);
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
        Node temp=get(pos-1);
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
           Node temp=get(pos-1);
            Node node =new Node(val,temp.next);
            temp.next=node;
            return;
        }
        System.out.println("Invalid position");
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }System.out.println("END");
    }
}
