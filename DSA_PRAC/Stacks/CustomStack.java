package DSA_PRAC.Stacks;
public class CustomStack {
    private static final int DEFAULT_SIZE = 10;
    private int[] arr;
    private int ptr = -1;

    public CustomStack() {
        this.arr = new int[DEFAULT_SIZE];
    }

    public CustomStack(int size) {
        this.arr = new int[size];
    }

    public boolean isEmpty() {
        return ptr == -1;//if stack is empty return true;
    }

    public boolean isFull() {
        return ptr == arr.length - 1;//if full returns true;
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack  overflows");
            return false;
        }
        arr[++ptr] = item;//make ++ptr and push item
        return true;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[ptr--];//pops out the topmost ele.
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        if (isFull()) {

            System.out.println("Stack overflows");
            return -1;
        }
        return arr[ptr];
    }
}


