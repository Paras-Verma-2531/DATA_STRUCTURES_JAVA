package LinkedList;
public class SinglyLinkedList {
   public Node head;
    public Node temp;

    public void add(int data) {

        Node node = new Node(data);
        if (head == null) {
            head = temp = node;
        } else {
            temp.next = node;
            temp = node;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("list is empty");
        } else {
            temp = head;
            while (temp.next != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }

    public void addAtBeg(int data) {
        if (head == null) {
            add(data);
        } else {
            Node node = new Node(data);
            node.next = head;
            head = node;
        }
    }

    public void addAtEnd(int data) {
        if (head == null) {
            add(data);
        } else {
            Node node = new Node(data);
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public int length() {
        int c = 0;
        if (head != null) {
            temp = head;
            while (temp != null) {
                temp = temp.next;
                c += 1;
            }
        }
        return c;
    }

    public void addAtAnyPos(int pos, int data) {
        if (pos < 1 || pos > length()) {
            System.out.println("invalid position!!");
        } else if (pos == 1) {
            addAtBeg(data);
        } else {
            int i = 1;
            temp = head;
            Node node = new Node(data);
            while (i < pos - 1) {
                temp = temp.next;
                i++;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }

    public  int  deleteFromBeg() {
        int data;
        if (head == null) {
            System.out.println("list is empty");
        } else {
            data=head.data;
            head = head.next;
            return  data;
        }
        return -1;
    }

    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("list is empty");
        } else if (head.next == null) {
            head = null;
        } else {
            temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void deleteFromAnyPos(int pos) {
        if (pos < 1 || pos > length()) {
            System.out.println("invalid position!!");
        } else if (pos == 1) {
            deleteFromBeg();
        } else if (pos == length()) {
            deleteFromEnd();
        } else {
            int i = 1;
            temp = head;
            while (i < pos - 1) {
                temp = temp.next;
                i++;
            }
            temp.next = temp.next.next;
        }
    }
    public void reverse()
    {
        if(head==null){
            System.out.println("list is empty");}
        else if(head.next==null){}
        else
        {
            Node current;Node nextnode;Node prev=null;
            nextnode=current=head;
            while(nextnode!=null)
            {
                nextnode=nextnode.next;
                current.next=prev;
                prev=current;
                current=nextnode;
            }head=prev;
        }
    }
}


