import java.util.Scanner;
    public class PoundsToKilograms {
    
        public static void main(String [] args) {
        Scanner input = new Scanner(System.in);          
            
        //Prompt user to enter number of pounds
           System.out.print("Enter number in pounds: ");
            double pound = input.nextDouble();
                
        
            double kilo = (pound * .454);
        
        //display output on console
           System.out.println( pound + " pounds is: " + kilo + " kilograms"); 
        }
    }

        
        
                
        
        
