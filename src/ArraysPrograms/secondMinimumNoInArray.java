package ArraysPrograms;

import java.util.Arrays;

public class secondMinimumNoInArray
{
    public static void main(String[] args)
    {

        int a[] = { 10,30,50,70,90,20,40,60,80,100};

        // sort array
        Arrays.sort(a);

        System.out.println("2nd minimum value in array is "+a[1]);

    }
}
