import java.util.Scanner;
public class StringSubstring {
 
    public static void main(String [] args)
    {Scanner input = new Scanner(System.in);
    
    System.out.print("Enter first string:  ");
    String s1 = input.nextLine();
    System.out.print("Enter second string: ");
    String s2 = input.nextLine();
    
    if (s1.contains(s2))
        System.out.println(s2 + " is a substring of  " + s1);
    
    
    }
    
}
