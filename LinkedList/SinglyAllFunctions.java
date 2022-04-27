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
            System.out.println("invalid position");}
        else if(pos == 1) {
                addAtFront(data);// call for addAtFront() method
        }
        else {
                //System.out.println("here");
                Node node = new Node(data);
                int i = 1;
                temp = head;
                while (i < pos - 1) {// traverse till pos -1
                    temp = temp.next;
                    i++;
                }
                node.next = temp.next;// linking new node
                temp.next = node;
                //System.out.print("inserted data is "+temp.next.data);
        }
    }
    public int deleteFromBeg() {
        int data = -1;
        if(head==null){}
        else if(head.next==null)
        {
            Node.length--;
            data=head.data;
            head=null;
        }
        else{
            Node.length--;
            data = head.data;
            head = head.next;
        }
        return data;
    }

    public int deleteFromEnd() {
        int data = -1;
        temp = head;
        if(head==null){}
        else if(head.next==null){
            data=head.data;
            head=null;
        }
        else{
            while (temp.next.next != null) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = null;
        }
        return data;
    }
    public int deleteFromPos(int pos) {
        int data = -1;
        if(pos<=0||pos>Node.length){}
        if(pos==1){data=deleteFromBeg();}
        else if(pos==Node.length){data=deleteFromEnd();}
        else {
            int i = 1;
            temp = head;
            while (i < pos - 1) {
                temp = temp.next;
                i++;
            }
            data = temp.next.data;
            temp.next = temp.next.next;

        }
        return data;
    }
    public void display()
    {
        System.out.println("the list is : ");
        temp=head;
        while(temp.next!=null)
        {
            System.out.print(temp.data+" -->");temp=temp.next;
        }
        System.out.println(temp.data);
    }
    public void FrontNodeAtEnd()
    {
        if(head==null||head.next==null){return;}
        else
        {
            Node newnode=head;
            temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }temp.next=newnode;
            head=head.next;
        } System.out.println("successfully inserted");
    }
    public void EndNodeAtFront()
    {
        if(head==null||head.next==null){return;}
        else
        {
            temp=head;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }Node newnode=temp.next;
            temp.next=null;
            newnode.next=head;
            head=newnode;
        }
        System.out.println("successfully inserted");

    }
    public void frontNodeAtPos(int pos)
    {
        if(pos<=0||pos>Node.length)
        {
            System.out.println("invalid position");
        }else
        {
            if(head==null||head.next==null){return;}
            int i=1;
            Node newnode=head;temp=head;
            while(i<pos-1)
            {
                temp=temp.next;
            }newnode.next=temp.next;
            temp.next=newnode;
            head=head.next;

        }
    }
}

