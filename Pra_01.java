package Practice;

public class Pra_01
{
    public static void main(String[] args)
    {
        //Print the value from a to z

        char ch;
        for (ch ='a'; ch <= 'z'; ch++)
            System.out.println(ch);

//========================================================================================
        //Print the value from a to z using while activity;


        char c = 'a';
        while (c <='z'){
            System.out.println(c);
            c++;
        }
        //================================================================================

        //Using a do while loop:

    char chr = 'A';

        do {
            System.out.println(chr);
            chr++;
        }
         while (c <= 'Z');

//=========================================================================================

        char capitalalpha = 'A';
        do
        {
        System.out.println(capitalalpha);

        capitalalpha++;
        }
        while (capitalalpha <= 'Z');
        

    }

}