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
		
		while(originalNumber != 0){
			
			remainder = originalNumber % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			originalNumber = originalNumber / 10;
		}
		
		System.out.println("Reversed Number: " + reversedNumber);
	}

}
