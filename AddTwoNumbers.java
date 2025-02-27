import java.util.Scanner;

class AddTwoNumbers{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number : ");
int firstNumber =  sc.nextInt();

System.out.println("Enter second number : ");
int secondNumber =  sc.nextInt();

int sum = firstNumber + secondNumber;
System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + sum);

	}
}

