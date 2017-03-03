
public class MilesPerHour {

	public static void main(String[] args) {
		double min = 45;
		double sec = 30;
		double kilometers = 14;
		
		double miles = kilometers / 1.6;
		double hours = (((sec / 60) + min) / 60);
		
		System.out.println(miles + " miles per " + hours + " hours");
		
		
		
		

	}

}
