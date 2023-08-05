package DSA_PRAC.MATHS;
public class findTheIthBit  {
    //function to get the ith bit:
    public static int getIthBit(int n,int i)
    {
        return (n&(1<<i))!=0?1:0;
    }
    //function to set the ith bit
    public static  int setIthBit(int number,int index)
    {
        int ithBit=getIthBit(number,index);
        if(ithBit==0)
        {
           return number|1<<index;
        }return number;
    }
    //function to clear the ith bit
    public static  int clearIthBit(int number,int index)
    {
        /*
          10100
         &11011 [negation of 1 << ith]
          -----
          10000
         */
        int mask=~(1<<index);
        return number&mask;
    }
    public static void main(String[] args) {
        //System.out.println(getIthBit(20,2));
        //System.out.println(setIthBit(20,3));
        System.out.println(clearIthBit(20,2));
    }
}
