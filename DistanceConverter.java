import java.util.Scanner;

class DistanceConverter{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	// Enter distance in Kilometers
	System.out.println("Enter distance in Kilometers : ");
	int distanceInKilometers = sc.nextInt();
	
	// Result in Miles
	double distanceInMiles = distanceInKilometers * 0.621371;
	System.out.println("The distance in miles is : " + distanceInMiles);	
	
	
	sc.close();
	}
}
