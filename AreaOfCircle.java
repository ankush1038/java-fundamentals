import java.util.Scanner;

class AreaOfCircle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of the circle : ");
		int radius = sc.nextInt();
		
		double area = Math.PI*radius*radius;
		System.out.println("Area of circle is " + area);
		
		sc.close();
	}
}