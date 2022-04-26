package Tree;
import Tree.NodeTree;
import  java.util.Stack;
public class staticTree {
    NodeTree curr=null;
    NodeTree temp=null;
    public void postorder(NodeTree root)
    {
        Stack<NodeTree>stack=new Stack<>();
        curr=root;
        while(curr!=null||stack.size()>0) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            temp=stack.peek().right;
            if(temp==null)
            {
                temp=stack.pop();
                System.out.println(temp.data);
                while (stack.size()>0&&temp==stack.peek().right)
                {
                    temp=stack.pop();
                    System.out.println(temp.data);
                }
            }else
            {
                curr=temp;
            }
        }
    }
    public static void main(String[] args) {
        NodeTree root=new NodeTree(1);
         root.left=new NodeTree(2);
        root.right=new NodeTree(3);
        root.left.right=new NodeTree(4);
        root.left.left=new NodeTree(5);
        root.right.left=new NodeTree(6);
        root.right.right=new NodeTree(7);
       staticTree tree= new staticTree();
       tree.postorder(root);
    }
}
