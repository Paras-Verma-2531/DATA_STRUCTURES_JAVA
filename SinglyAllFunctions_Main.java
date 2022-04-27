import LinkedList.SinglyAllFunctions;
import java.util.Scanner;
public class SinglyAllFunctions_Main {
    public static void main(String[] args) {
        int choice, data, result, position;
        SinglyAllFunctions sl = new SinglyAllFunctions();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("'1' for insertion At front\n'2' for insertion At End\n'3' for insertion At Pos\n'4' for deletion from Front\n'5' for deletion from end\n'6' for deletion from pos\n'7' for FrontNodeAEnd\n'8' for EndNodeAtFront\n'9' for FrontNodeAtPos\n'10' for display\n'11' for exit");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("enter the data: ");
                    data = in.nextInt();
                    sl.addAtFront(data);
                    break;
                case 2:
                    System.out.print("enter the data: ");
                    data = in.nextInt();
                    sl.addAtEnd(data);
                    break;
                case 3:
                    System.out.print("enter the data and position: ");
                    data = in.nextInt();
                    position = in.nextInt();
                    sl.addAtPos(data,position);
                    break;
                case 4:
                    result = sl.deleteFromBeg();
                    System.out.println(result == -1 ? "list is empty" : "the deleted data is :" + result);
                    break;
                case 5:
                    result= sl.deleteFromEnd();
                    System.out.println(result == -1 ? "list is empty" : "the deleted data is :" + result);
                    break;
                case 6:
                    System.out.print("enter the position from where u want to delete data: ");
                    position=in.nextInt();
                    result=sl.deleteFromPos(position);
                    System.out.println(result == -1 ? "list is empty" : "the deleted data is :" + result);
                    break;
                case 7:
                    sl.FrontNodeAtEnd();
                    break;
                case  8:
                    sl.EndNodeAtFront();
                    break;
                case 9:
                    System.out.print("enter the position where u want to bring head node: ");
                    position=in.nextInt();
                    sl.frontNodeAtPos(position);
                    break;
                case 10:
                    sl.display();
                    break;
                case 11:
                    System.exit(0);
                default:
                    System.out.println("enter valid input");


            }

        }
    }
}
