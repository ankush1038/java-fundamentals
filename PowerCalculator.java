import java.util.Scanner;

class PowerCalculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Enter base
		System.out.println("Enter base : " );
		int base = sc.nextInt();
		
		// Enter exponent
		System.out.println("Enter exponent : " );
		int exponent = sc.nextInt();
		
		// Find power
		double result = Math.pow(base,exponent);
		System.out.println(base + " raised to the power " + exponent + " is " + result );

sc.close();		
	}
}
