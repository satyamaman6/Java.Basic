package Practice;

import java.util.Scanner;

public class largest_number {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //      print the intake user until they enter value less than 99990

      System.out.println("please enter num1");
        long num1 = input.nextLong();
        System.out.println("please enter num2");
        long num2 = input.nextLong();
        System.out.println("please enter num3");
        long num3 = input.nextLong();

        long max = num1;

        if (num2> num1)
        {
            max = num2;
        }
        if (num3 > max)
        {
            max = num3;
        }
        System.out.println("Largest Number is " + max);



        //Method 2:

        System.out.println("please enter num1");
        long num4 = input.nextLong();
        System.out.println("please enter num2");
        long num5 = input.nextLong();
        System.out.println("please enter num3");
        long num6 = input.nextLong();

        long max1 = Math.max(num4, Math.max(num5, num6));
        System.out.println(max1);


    }
}
