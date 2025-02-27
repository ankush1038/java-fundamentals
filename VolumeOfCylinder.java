import java.util.Scanner;

class VolumeOfCylinder{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	// Enter Radius
	System.out.println("Enter radius of the cylinder : ");
	int radius = sc.nextInt();
	
	// Enter height 
	System.out.println("Enter height of the cylinder : ");
	int height = sc.nextInt();
	
	// Find volume
	double volume = Math.PI * radius * radius * height;
	System.out.println("Volume of the cylinder is : " + volume );
	
	}	
}