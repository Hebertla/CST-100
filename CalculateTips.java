import java.util.Scanner;
    public class CalculateTips{
    
        public static void main(String [] args) {
			Scanner input = new Scanner(System.in);          
            
        	//Prompt user to enter number of subtotal
            System.out.print("Enter subtotal amount, for example 5.25 for $5.25:  ");
            double total = input.nextDouble();
                
        //prompt user to enter rate
            System.out.print("Enter gratuity rate, for example 12 for 12%:  ");
            double rate = input.nextDouble();
        
        //calculate gratuity
            double grat = rate /100 * total;
            
        //display output on console
        System.out.println("The gratuity is: $" + grat + " and total is: $" + (grat+total));    }
        
                
        
}