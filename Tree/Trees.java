package Tree;
import java.util.Scanner;
public class Trees {
    private static class TreeNode
    {
        int value;
         TreeNode left,right;
        //constructor to initialize object
        TreeNode(int value)
        {
            this.value=value;
            this.left=null;
            this.right=null;
        }
    }
    private TreeNode root;
    // insert the values:
    public void populate()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the root value : ");
        int value=in.nextInt();
        root=new TreeNode(value);
        populate(root);

    }
    private void populate(TreeNode root) {
        Scanner in= new Scanner(System.in);
        System.out.println("Do you want to enter the left of: "+root.value);
        boolean left=in.nextBoolean();
        if(left)
        {
            System.out.println("Enter the value of left of : "+root.value);
            int leftVal=in.nextInt();
            root.left=new TreeNode(leftVal);
            populate(root.left );
        }
        System.out.println("Do you want to enter the right of: "+root.value);
        boolean right=in.nextBoolean();
        if(right) {
            System.out.println("Enter the value of right of : " + root.value);
            int rightVal = in.nextInt();
            root.right = new TreeNode(rightVal);
            populate(root.right);
        }
    }
    public void display()
    {
      display(root," ");
    }
    private void display(TreeNode root, String s) {
        if(root==null)return;
        System.out.println(s+root.value);
        display(root.left,s+"\t");
        display(root.right,s+"\t");
    }
    public void prettyDisplay()
    {
        prettyDisplay(root,0);
    }
    private void prettyDisplay(TreeNode root, int level) {
        if(root==null)return;
        prettyDisplay(root.right,level+1);
        if(level!=0)
        {
            for(int i=0;i<level-1;i++) System.out.print("|\t\t");
            System.out.println("|------->"+root.value);
        }
        else {
            System.out.println(root.value);
        }
        prettyDisplay(root.left,level+1);
    }
    public static void main(String[] args) {
        Trees tree= new Trees();
        tree.populate();
        tree.prettyDisplay();
        //tree.display();
    }
}
