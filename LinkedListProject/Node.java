package LinkedListProject;
public class Node {
    Node next,prev;
    int data;
    protected int length;
    public Node(int data)
    {
        this.data=data;
        next=prev=null;
        length++;
    }
}
