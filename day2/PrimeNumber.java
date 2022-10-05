package week1.day2;

import java.util.Iterator;

public class PrimeNumber {
	public static void main(String[] args) {
		int input = 25;
		int j;
		boolean flag = false;
		for (int i = 2; i<input;i++ )
		{
			j= input%i;
			
					if(j==0) {
						flag = true;
				break;
					}
		}		
					if(flag==false) {
				System.out.println("Prime Number");		
			
		}else
			System.out.println("Not a prime Number");				
			
			}
}

