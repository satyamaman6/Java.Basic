package Practice;

import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        //take input from user if the salary in less than 25000 then add Rupees 5000 in salary either inc by 2000.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your salary: ");
        int salary = input.nextInt();

        if (salary > 25000)
        {
            System.out.println("Your salary is Low " +
                    "We are adding some amount in your salary");
            salary +=  2000;
        }
        else
        {
            salary += 5000;
        }

        System.out.println(salary);

/*Print the else-if statement and find the values

       System.out.println("Print your salary");
        int salary = input.nextInt();

        if (salary > 5000)
        {
            salary += 500;
        }
        else if (salary <2000)
    */

    }
}
