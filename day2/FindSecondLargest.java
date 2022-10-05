package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] Data = {8,5,11,4,6,7,10,1};
		Arrays.sort(Data);
		int Length = Data.length;
		System.out.println("The Ascending Order is");
	for (int i=0; i<Length; i++) {
		System.out.println(Data[i]);

	}
	System.out.println("------------------------------");
	System.out.println("2nd Element from the last is " + Data[Length-2]);
	}
}
