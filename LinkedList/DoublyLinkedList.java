package LinkedList;

public class DoublyLinkedList {
    DoubleNode head, tail, temp;

    public void AddAtBeg(int data) {
        DoubleNode node = new DoubleNode(data);
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }
    public void AddAtEnd(int data) {
        DoubleNode node = new DoubleNode(data);
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }
    int length() {
        int c = 0;
        temp = head;
        if (temp != null) {
            while (temp != null) {
                c = c + 1;
                temp = temp.next;
            }
        }
        return c;
    }
    public void AddAtPos(int pos, int data) {
        if (pos < 1 || pos > length()) {
            System.out.println("invalid position");
        } else if (pos == 1) {
            AddAtBeg(data);
        } else {
            int i = 1;
            temp = head;
            DoubleNode node = new DoubleNode(data);
            while (i < pos - 1) {
                temp = temp.next;
                i++;
            }
            node.next = temp.next;
            node.prev = temp;
            temp.next.prev = node;
            temp.next = node;
        }
    }
    public void display() {
        if (head == null) {
            System.out.println("list is empty");
        } else {
            temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    public void deleteFromBeg()
    {
        if(head==null){
            System.out.println("list is empty");}
        else
        {
            head=head.next;
            head.prev=null;
        }
    }
    public void deleteFromEnd()
    {
        if(head==null){
            System.out.println("list is empty");}
        else
        {
            tail=tail.prev;
            tail.next=null;
        }
    }
    public void deleteFromPos(int pos)
    {
        if(pos<1||pos>length()){
            System.out.println("invalid position");}
        else if(pos==1){deleteFromBeg();}
        else if(pos==length()){deleteFromEnd();}
        else
        {temp=head;
            int i=1;
            while(i<pos)
            {
                temp=temp.next;
                i++;
            }temp.next.prev=temp.prev;
            temp.prev.next=temp.next;
        }
    }
}
