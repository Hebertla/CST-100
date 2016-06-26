import java.util.Scanner;
public class HowManyDaysMonth {
    public static void main(String[] args)
    { Scanner input = new Scanner(System.in);
   int day, month, year;
   String xmonth = null;
    
   
   //prompt user to enter a month and year
   System.out.print("Enter a month, example 1 for January: ");
    month = input.nextInt();
    System.out.print("Enter a year: ");
    year = input.nextInt();
    
    //30 days in the month of April(4),June(6),September(9), and November(11)
    if (month==4 || month==6 || month==9 || month==11)
    {day = 30;}
    
    else if (month==2)
    
    {       if ((year %4)==0);
            
                    { day= 29;
             xmonth = "Feb";}
           
            {
             day = 28;}
                xmonth = "Feb";
    }
    else
    {       day = 31;}
    
    if (month ==1)
        xmonth = "Jan";
    if (month ==3)
        xmonth = "Mar";
    if (month ==4)
        xmonth = "Apr";
    if (month ==5)
        xmonth = "May";
    if (month ==6)
        xmonth = "Jun";
    if (month ==7)
        xmonth = "Jul";
    if (month ==8)
        xmonth = "Aug";
    if (month ==9)
        xmonth = "Sep";
    if (month ==10)
        xmonth = "Oct";
    if (month ==11)
        xmonth = "Nov";
    if (month ==12)
        xmonth = "Dec";
      
    System.out.println(xmonth +" " + year + " has " +day+ " days");
    input.close();  }
    }

    
    
    
    
    
    

