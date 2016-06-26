public class PopulationInFiveYears {

	public static void main(String[] args) {
		//given data
		int pop = 312032486;
		int birthsec = 7;
		int deathsec = 13;
		int immigrantsec = 45;

                //convert to seconds in 5 years
		long seconfiveyears = 60*60*24*365*5;
		
		//computations
		long birth = seconfiveyears / birthsec;
		long death = seconfiveyears / deathsec;
		long immigrant = seconfiveyears / immigrantsec;
		
		//console display
System.out.println("Population with birth in the next five years is: " + 
        pop + birth);

System.out.println("Population with death excluding bith and "
        + "immigrants in five year is: "
        + (pop - death));

System.out.println("Population of immigrants in the next five years is: " 
        + pop + immigrant);}
}

