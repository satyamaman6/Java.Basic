package Practice;

public class array_to_string {

    //here i am converting array into string

    public static void main(String[] args) {
        char[] ch = {'S','A','T','Y','A','M',' ','S','H','R','I','V','A','S','T','A','V','A'};
        String str = new String (ch);
        System.out.println(str);

        //method 2: Using value of method
       String str2 = String.valueOf(ch);
           System.out.println(str2);
    }
}
