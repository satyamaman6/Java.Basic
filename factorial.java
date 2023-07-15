package Practice;

import java.util.Scanner;

public class factorial
{
    public static void main(String[] args)
    {
        int n, i, fact =1;
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the number for factorial");

        n = in.nextInt();

        for(i =1; i<=n; i++)
        {
            fact = i*fact;
        }
        System.out.println("Factorial of " +n+ " is : "+ fact);
    }
}
