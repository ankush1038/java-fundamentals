import java.util.Scanner;

class TemperatureConverter{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter temperature in Celcius : ");
	int temperatureInCelcius = sc.nextInt();
	
	int temperatureInFahrenheit = (temperatureInCelcius * 9/5) + 32;
	System.out.println("The temperature in Fahrenheit is : " + temperatureInFahrenheit);
	
	sc.close();
}
}