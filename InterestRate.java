import java.util.Scanner;
    public class InterestRate{
    
        public static void main(String [] args) {
	Scanner input = new Scanner(System.in);          
            
        	//Prompt user to enter the balance
            System.out.print("Enter the balance:  ");
            double balance = input.nextDouble();
                
        //prompt user to enter rate
            System.out.print("Enter rate, for example 12 for 12%:  ");
            double rate = input.nextDouble();
        
        //calculate interest
            double interest = balance * (rate /1200);
            
        //display output on console
        System.out.println("The interest is:  " + interest);    }
        
                
        
}