package Practice;

public class Average
{
    //Calculate the average of the array element.

    int sum = 0;
    void average() // It's method
    {
        int [] arr = {9,25,45,69};
        for (int i =0; i < arr.length; i++)
            sum = sum +arr[i];
        float average = sum/ arr.length;
        System.out.println("sum is " + sum + " and average is " + average);
    }
//We have created method and at the end we are calling the object.

    public static void main(String[] args)
    {
        Average obj = new Average();
        obj.average();
    }

}
