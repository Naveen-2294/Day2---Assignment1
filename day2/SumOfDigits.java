package week1.day2;

public class SumOfDigits {
	public static void main(String[] args) {
		// Declare your input number (int)
		int abc= 587638;
		int sum=0;
		while(abc>0)
		{
			int remainder=abc%10;
			
			sum = sum+remainder;
			
			abc = abc/10;
            		
		}

		System.out.println("The Sum of digits is "+sum);
		
				// Initialize an integer variable by name: sum

				// Use loop to calculate the sum: use while loop to set condition until the number goes greater than 0

				// Within loop: get the remainder when done by 10 -> Tip: use mod %

					// Print the remainder to confirm
			
					// Within loop: add that remainder to the sum
			
					// Print the sum to confirm
			
					// Within loop: get quotient of that number (tip: quotient should be same variable of loop condition)
			
					// Print the quotient to confirm
				
				// Outside the loop: print the final sum
	}

}
