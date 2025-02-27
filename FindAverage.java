import java.util.Scanner;

class FindAverage{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//Enter first number
		System.out.print("Enter first number : ");
		int firstNumber = sc.nextInt();
		
		//Enter second number
		System.out.print("Enter second number : ");
		int secondNumber = sc.nextInt();
		
		
		// Enter third number
		System.out.print("Enter third number : ");
		int thirdNumber = sc.nextInt();
		
		// Find average
		int average = (firstNumber + secondNumber + thirdNumber)/3;
		System.out.println("Average of " + firstNumber + ", " + secondNumber + " and " + thirdNumber + " is " + average) ;
	}	
}