import java.util.Scanner;

class PerimeterOfRectangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Enter length
		System.out.println("Enter length : ");
		int length = sc.nextInt();
		
		//Enter width
		System.out.println("Enter width : ");
		int width = sc.nextInt();
		
		// Find Perimeter
		int perimeterOfRectangle = 2 * (length + width);
		System.out.println("The Perimeter of the rectangle is : " + perimeterOfRectangle);
		
		sc.close();
	}
}