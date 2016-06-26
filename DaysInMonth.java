import java.util.Scanner;
public class DaysInMonth {
    public static void main(String[] args)
    { Scanner input = new Scanner(System.in);
   int day, year;
String month;
   
    
   
   //prompt user to enter a month and year
   System.out.print("Enter first three letters of month, first letter capitilize: ");
    month = input.nextLine();
    System.out.print("Enter a year: ");
    year = input.nextInt();
    
    //30 days in the month of April(4),June(6),September(9), and November(11)
    if 
    (month.equals("Apr") || month.equals("Jun") ||
     month.equals("Sep") || month.equals("Nov"));
{                day = 30;}

    
    if (month.equals("Feb"))
    
    {       if ((year %4)==0);
            
                    { day= 29;
             }
                  
            {
             day = 28;}
                
    }
    else
    {       day = 31;}
    
System.out.println( month + " " + year +"  has  " + day +"  days");
    
    }
}

