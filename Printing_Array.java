package Practice;

import java.util.Arrays;

public class Printing_Array
{
// Print the specific element of the Array.

    public static void main(String[] args)

    {
        int arra[] = {10,20,63,2551,98};

        int size = arra.length;

        Arrays.sort(arra);

        System.out.println("Sorted Array " + Arrays.toString(arra));    // sorting the array

        System.out.println("last element of Array is " + arra[size-1]);    // here i am printing the last value of the array

        System.out.println(arra[0]); //printing the 1st value of array
    }
}
