package DSA_PRAC.SEARCHING;

import java.util.Scanner;

public class LinearSearch {
    private int element;
    public int linearSearch(int[] array,int element)
    {
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==element)
                return 1;
        }return -1;
    }
    public void inputElement(int[]array,int size)
    {
        Scanner in= new Scanner(System.in);
        for(int i=0;i<size;i++)
        {
            System.out.print("enter the "+(i+1)+ " element : ");
            array[i]=in.nextInt();
        }
        System.out.print("enter the element to be searched: ");
        element=in.nextInt();

    }
    public static void main(String[] args) {
        LinearSearch ls= new LinearSearch();
        int[] array=new int[10];
        ls.inputElement(array,10);
        int res=ls.linearSearch(array, ls.element);
        System.out.println(res==1?"the element is present":"element is not present");
    }
}
