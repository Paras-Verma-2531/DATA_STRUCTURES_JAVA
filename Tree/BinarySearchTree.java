package Tree;
public class BinarySearchTree {
    private static class Node
    {
        private int value;
        private Node left;
        private Node right;
        Node(int value)
        {
            this.value=value;
            this.left=null;
            this.right=null;
        }
    }
    public BinarySearchTree(int rootValue)
    {
        root=new Node(rootValue);// set the root
    }
    private Node root=null;
    public int getValue(Node node)
    {
        return node.value;
    }
    public boolean isEmpty()
    {
        return root==null;
    }
    public void insert(int value)
    {
        root=insert(root,value);
    }
    private Node insert(Node root, int value) {
        if(root==null)
        {
            return new Node(value);
        }
        if(value<=root.value)
        {
            root.left=insert(root.left,value);
        }
        else
            root.right = insert(root.right, value);
        return root;
    }
    public void display()
    {
        display(root,"root node : ");
    }

    private void display(Node root, String s) {
        if(root==null)return;
        System.out.println(s+root.value);
        display(root.left,"left child of "+root.value+" : ");
        display(root.right,"right child of "+root.value+" : ");
    }

    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree(10);
        bst.insert(11);
        bst.insert(1);
        bst.insert(20);
        bst.insert(2);
        bst.insert(13);
        bst.display();

    }
}
