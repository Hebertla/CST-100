import java.util.*;
class demo {
    public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
       int day = 0;
       int year; 
       String month;
       
 
       
    System.out.print("Enter first three letters of month, first letter capitilize: ");
    month = input.nextLine();
    System.out.print("Enter a year: ");
    year = input.nextInt();
    

        switch (month) {
            case "Jan":
            case "Mar":
            case "May":
            case "Jul":
            case "Aug":
            case "Oct":
            case "Dec":
                day = 31;
                break;
            case "Apr":
            case "Jun":
            case "Sep":
            case "Nov":
                day = 30;
                break;
            case "Feb":
                if ( ((year % 4 == 0) && !(year % 100 == 0))
                     || (year % 400 == 0) )
                    day = 29;
                else
                    day = 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        System.out.println(month + " " + year + " " + " has " + day + " days");
  
    
    }
}