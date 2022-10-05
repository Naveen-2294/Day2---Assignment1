package week1.day2;

public class ArmstrongNumber {
	public static void main(String[] args) {
		// Declare your input
int input = 153;
		

		// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)
		
int a = 0;
int b = 0;
int c = input;	
	

		// Assign input into variable original 	

		// Use loop to calculate: use while loop to set condition until the number greater than 0

while(input>0)
{
b = input%10;
input = input/10;
a= a+b*b*b;
}
if(c==a) {
	System.out.println("Armstrong Number");
}else
System.out.println("Not an Armstrong Number");
}
}

		// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)

		

		// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)

		

		// Within loop: Add calculated with the cube of remainder & assign it to calculated

		
			

		// Check whether calculated and original are same

	

		//When it matches print it as Armstrong number


	



	

	

	

	



	


