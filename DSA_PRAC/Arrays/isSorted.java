package DSA_PRAC.Arrays;
public class isSorted {
    public boolean isArraySorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new isSorted().isArraySorted(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 111, 121, 222}));
    }
}
