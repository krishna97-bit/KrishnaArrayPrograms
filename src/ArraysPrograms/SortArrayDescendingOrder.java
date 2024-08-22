package ArraysPrograms;

import java.util.Arrays;

public class SortArrayDescendingOrder
{
    public static void main(String[] args)
    {
        int a[] = {10,40,30,20,50,60,100,80,70,90};

        Arrays.sort(a);

        for ( int i=a.length-1; i>=0; i--)
        {
            System.out.print(a[i]+",");
        }

    }
}
