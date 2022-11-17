import java.util.InputMismatchException;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean pass = true;

		
		while(pass) {
	int mode = startInterface();
			//convert fahrenheit to celsius
	if(mode == 1) {
		toCelsiusConverter();	
		}
			//convert celsious to fahrenheit
	else if (mode == 2) {
		toFahrenheitConverter();	
		}
			
	else if (mode == 0) {
		pass = false;
	}
			
	else {
		System.out.println("\nPlease select converter by tiping numbers 1 or 2 into the console");
		System.out.println("");
		pass = true;
			}
		}

		
	}
	static Scanner sc = new Scanner(System.in);
	
	
	public static int startInterface() {
		boolean done = false;
		int answer = 9;
		while(!done) {
			try {
		System.out.println(" __________________________________________");
		System.out.println("|To convert Fahrenheits to celsius enter 1 |"
					   + "\n|To convert celsius to fahrenheit enter 2  |"
					   + "\n|To exit enter 0                           |"
				        +"\n|__________________________________________|");
		answer = sc.nextInt();
		done = true;
			} catch(InputMismatchException e){
				String str = sc.nextLine();
				System.out.println("invalid value please try again: ");
			}
			}
		return answer;
	}
	
	public static void toCelsiusConverter() {
		
		boolean done = false;
		double fahrenheit = 0;
		while(!done) {
		try {
		System.out.println("Enter the value in Fahrenheit: ");
		fahrenheit = sc.nextDouble();
		done = true;
		} catch(InputMismatchException e){
			String str = sc.nextLine();
			System.out.println("invalid value please try again: ");
		}
		}
		double inCelsius = toCelsius(fahrenheit);
		System.out.printf( "%.2f" + "° farenheits would be equal to: "+ "%.2f" + "° Celsius \n",fahrenheit , inCelsius);
		System.out.println("");
	}	
	
	public static void toFahrenheitConverter() {
		boolean done = false;
		double celsius = 0;
		while(!done) {
		try {
		System.out.println("Enter the value in celsius: ");
		celsius = sc.nextDouble();
		done = true;
		
		} catch(InputMismatchException e){
			String str = sc.nextLine();
			System.out.println("invalid value please try again: ");
		}
		}
		
		double inFahrenheit = toFahrenheit(celsius);
		System.out.printf( "%.2f" + "° celsius would be equal to: "+ "%.2f" + "° fahrenheits \n", celsius, inFahrenheit);
		System.out.println("");

	}
	
	
	
	public static double toCelsius (double input ){
		double celsius = (input-32) * 5/9;
		return celsius;
	}

	public static double toFahrenheit (double input ){
		double fahrenheit = (input * 9/5) + 32;
		return fahrenheit;
	}
}
