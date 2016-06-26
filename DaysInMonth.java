import java.util.Scanner;

public class DaysInMonth {
public static void main(String [] args)
{
    Scanner input = new Scanner(System.in);
    int year, day;
    String month;
    
            
            //prompt user to enter month, year
            System.out.print("Enter first three letter for month, first letter "
                    + "capitilize, for example Apr for April:  ");
            month = input.nextLine();
          
            
            System.out.print("Enter a year, example 2016.: ");
            year = input.nextInt();
            
            //30 days in April,June,September,November.
            if 
                   (month.equals("Apr") || month.equals("Jun") ||
                    month.equals("Sep") || month.equals("Nov"));
            {                day = 30;}
            
            
             else if  
              
                (month.equals("Feb"));
                    if {(year % 4)==0;
                  {   day = 29;}
                 
                     else 
                     {  day = 28;}}   
                  

            else   
                             
            (month.equals("Jan") || month.equals("Mar") || 
                       month.equals("May") || month.equals("Jul") ||
                       month.equals("Aug") || month.equals("Oct") || 
                        month.equals("Dec"));  
                    {   day = 31; }
  
  System.out.println(month+ " " + year  + "has " + day + "days");
                   
}       }



