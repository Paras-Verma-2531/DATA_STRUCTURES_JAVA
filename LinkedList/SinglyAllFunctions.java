package LinkedList;
public class SinglyAllFunctions {
    public Node head, temp;

    public void addAtFront(int data) {
        Node node = new Node(data);
        if (head != null) {// if head!=null
            node.next = head;
        }// else set node as head
        head = node;
    }
    public void addAtEnd(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            temp = head;
            while (temp.next != null) {// traverse till last node
                temp = temp.next;
            }
            temp.next = node;// insertion at last node
        }
    }
    public void addAtPos(int data, int pos) {
        if (pos > Node.length || pos <= 0) {// check for invalid input
            System.out.println("invalid position");
            if (pos == 1) {
                addAtFront(data);// call for addAtFront() method
            } else {
                Node node = new Node(data);
                int i = 1;
                temp = head;
                while (i < pos - 1) {// traverse till pos -1
                    temp = temp.next;
                    i++;
                }
                node.next = temp.next;// linking new node
                temp.next = node;
            }
        }
    }
    public int deleteFromBeg()
    {
        int data=-1;
        if(head!=null)
        { Node.length--;
            data=head.data;
            head=head.next;
        }return data;
    }
    public int deleteFromEnd()
    {
        int data=-1;
        temp=head;
        if(temp!=null)
        {
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }data=temp.next.data;
            temp.next=null;
        }return data;
    }
    public int deleteFromPos(int pos)
    {
        i
    }
}
