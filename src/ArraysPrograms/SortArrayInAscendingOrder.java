package ArraysPrograms;

import java.util.Arrays;

public class SortArrayInAscendingOrder
{
    public static void main(String[] args)
    {
        int a[] = {10,40,30,20,50,60,100,80,70,90};

       // sort the array in ascending order
        Arrays.sort(a);

        // print array
        for ( int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+",");
        }

    }
}
