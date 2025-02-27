import java.util.Scanner;

class SimpleInterest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//Enter Principle
		System.out.println("Enter principle : ");
		int principle = sc.nextInt();
		
		//Enter Rate
		System.out.println("Enter rate : ");
		int rate = sc.nextInt();
		
		//Enter Time
		System.out.println("Enter time : ");
		int time = sc.nextInt();
		
		// Find Simple Interest
		int simpleInterest = (principle*rate*time)/100;
		System.out.println("The simple interest is : " + simpleInterest);
 
 sc.close();
}
}