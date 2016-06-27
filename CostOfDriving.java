import java.util.Scanner;
    public class CostOfDriving{
    
        public static void main(String [] args) {
	Scanner input = new Scanner(System.in);          
            
        	//Prompt user to enter driving distance
            System.out.print("Enter the driving distance:  ");
            double distance = input.nextDouble();
                
        //prompt user to enter miles per gallon
            System.out.print("Enter how many miles per gallon:  ");
            double mpg = input.nextDouble();
        
        // prompt user to enter price per gallon
        System.out.print("Enter price per gallon:  ");
        double price = input.nextDouble();
        
        //calculate cost of driving
            double cost = (distance / mpg * price) *100 / 100.0;
            
        //display output on console
        System.out.printf("The cost of driving is: $%4.2f", cost);   
       
        }    
}