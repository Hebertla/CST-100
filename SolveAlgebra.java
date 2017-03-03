
public class SolveAlgebra {

	public static void main(String[] args) {
		//given data
		double a = 3.4;
		double b = 50.2;
		double c = 2.1;
		double d = 0.55;
		double e = 44.5;
		double f = 5.9;
		
		//compute with given formula
		double x = (((e*d)-(b*f)) / ((a*d)-(b*c)));
		double y = (((a*f)-(e*c)) / ((a*d)-(b*c)));
		
		System.out.println("The value for x is: " + x);
		System.out.println("The value for y is: " + y);
	}

}
