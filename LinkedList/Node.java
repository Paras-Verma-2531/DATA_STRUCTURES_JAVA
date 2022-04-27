package LinkedList;

public class Node {
    public Node next;
    public int data;public static int length=0;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
        length++;
    }
}
