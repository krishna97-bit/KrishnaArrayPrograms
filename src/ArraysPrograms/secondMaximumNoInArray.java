package ArraysPrograms;

import java.util.Arrays;

public class secondMaximumNoInArray
{
    public static void main(String[] args)
    {
        int a[] = { 10,30,50,70,90,20,40,60,80,100};

        // sort array in ascending order
        Arrays.sort(a);

        System.out.println("2nd maximum value for array is "+a[a.length-2]);

    }
}
