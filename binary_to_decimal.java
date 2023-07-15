package Practice;

import java.util.Scanner;

public class binary_to_decimal
{
    //Converting Binary to Decimal.

    public static void main(String[] args){
        Scanner input = new Scanner( System.in );
        System.out.print("Enter a binary number: ");
        String binaryString =input.nextLine();
        System.out.println("Output: "+Integer.parseInt(binaryString,2));


    }
}
