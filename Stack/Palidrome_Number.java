package Stack;
import java.util.Stack;
/*
Ques: Check whether a given no is palindrome or not:
Approach:: push the no into stack
pop out each element and use the formula [ d = stack.pop() * (int) Math.pow(10, i++) + d;]
till stack becomes empty
and check the no with "d";
 */
public class Palidrome_Number {

    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int n = x, p = 0;
        Stack<Integer> stack = new Stack<>();
        while (x != 0) {
            p = x % 10;
            stack.push(p);
            x /= 10;

        }
        int d = 0, i = 0;
        while (!stack.isEmpty()) {
            d = stack.pop() * (int) Math.pow(10, i++) + d;
        }
        return d==n;
    }
}

