import java.util.Scanner;

public class reverseInputNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number to reverse: ");
		
		int originalNumber = scanner.nextInt();
		int reversedNumber = 0;
		int remainder;
		
		//begin loop
		while(originalNumber != 0){
			
			//this gives the remainder with numbers divisible by 10
			remainder = originalNumber % 10;
			
			//this reverses the numbers input - one by one
			reversedNumber = reversedNumber * 10 + remainder;
			
	 
			originalNumber = originalNumber / 10;
		}
		
		//End Result
		System.out.println("Reversed Number: " + reversedNumber);
	}

}
