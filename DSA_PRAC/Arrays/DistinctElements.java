package DSA_PRAC.Arrays;

public class DistinctElements {
    public int countDistinctElements(int[] array,int length) {
        int res = 0, count = 0;
        for (int i = 0; i < array.length; i++) {
            int j = 0;
            while (j < i) {
                if (array[j] == array[i]) {
                    count = 0;
                    break;
                }
                count++;j++;
            }
            if (count!=0)
                res++;
        }if(array.length!=0)
            return res+1;
        return res;
    }

    public static void main(String[] args) {
        int[] array={1,2,3,4,5,1,2,3};
        System.out.println(new DistinctElements().countDistinctElements(array,array.length));
    }
}
