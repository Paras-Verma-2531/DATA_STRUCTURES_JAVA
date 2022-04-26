package Tree;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
public class dynamic_Tree {
    public int data;
    public dynamic_Tree left,right;
    public   static dynamic_Tree createTree()
    {
        Scanner in=new Scanner(System.in);
        int data;
        System.out.println("enter '-1' to return else any other data");
        data=in.nextInt();
        if(data==-1){return null;}
        dynamic_Tree node= new dynamic_Tree();
        node.data=data;
        System.out.println("enter the left child of :"+data);
        node.left=createTree();
        System.out.println("enter the right child of :"+data);
        node.right=createTree();
        return node;
    }
    public void preorder(dynamic_Tree root)
    {
        if(root==null){return;}
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public void levelOrder(dynamic_Tree root)
    {
        dynamic_Tree temp=root;
        Queue<dynamic_Tree> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            temp=queue.poll();
            System.out.println(temp.data);

            if(temp.left!=null)
            {
                queue.add(temp.left);
            }
            if(temp.right!=null)
            {
                queue.add(temp.right);
            }
        }
    }
    public static void main(String[] args) {
        dynamic_Tree ob= new dynamic_Tree();
        dynamic_Tree root= createTree();
        System.out.println("the tree is :");
        ob.preorder(root);
        System.out.println("the level order is:");
        ob.levelOrder(root);
    }
}
