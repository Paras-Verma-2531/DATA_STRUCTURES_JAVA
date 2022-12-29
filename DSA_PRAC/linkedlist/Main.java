package DSA_PRAC.linkedlist;
public class Main {
    public static void main(String[] args) {
        LL list=new LL();
        int i=5;
        while (i>=1)list.insertAtFirst(i--);
        //System.out.println(LL.getHead());
//        list.insertAtLast(6);
//        list.insert(1110,7);
        list.insertUsingRec(100,3);
        list.display();
//        System.out.println(list.deleteFirst());
//        System.out.println(list.deleteLast());
//        System.out.println(list.delete(3));
//        list.display();

    }
}
