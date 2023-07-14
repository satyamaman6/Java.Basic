package Practice;

import java.util.Scanner;

public class Marks_Calculation {
    public static void main(String[] args) {

        //        Write a code to take input from user to calculate the CGPA of 5 marks

        System.out.println("Please enter the input: ");
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter 1st marks");
        float S1 = in.nextFloat();

        System.out.println("Please enter 2st marks");
        float S2 = in.nextFloat();

        System.out.println("Please enter 3st marks");
        float S3 = in.nextFloat();

        System.out.println("Please enter 4st marks");
        float S4 = in.nextFloat();

        System.out.println("Please enter 5st marks");
        float S5 = in.nextFloat();
        float  CGPA = ((S1+S2+S3+S4+S5)/500)*100;

        System.out.println("Your CGPA is " + CGPA);

    }
}
