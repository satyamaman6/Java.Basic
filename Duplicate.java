package Practice;

public class Duplicate
{

    //Find the duplicate element

    public static void main(String args[])
    {
        int temp, size;
        int array[] = {10, 20, 20, 25, 63, 25, 96, 57};
        size = array.length;

        for(int i = 0; i < size; i++ )
        {
            for(int j = i+1; j < size; j++)
            {
                if(array[i] == array[j])
                {
                    System.out.println("Duplicate element is = " + array[j]);
                }
            }
        }
    
        String str = new String("ANFJFJUTIOK");
        int count = 0;
        char[] chars =str.toCharArray();
        System.out.println("Duplicate character are:");
        for (int i=0; i<str.length();i++){
            for (int j=i+1;j<str.length();j++) {
                if (chars[i] == chars[j]) {
                    System.out.println(chars[j]);
                    count++;
                    break;
                }
            }
        }
    }
}
