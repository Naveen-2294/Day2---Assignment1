package week1.day2;

public class FindIntersection {
	public static void main(String[] args) {
		int[] array1 = {3,2,11,4,6,7};
		int[] array2 = {1,2,8,4,9,7};
		int Length1 = array1.length;
		int Length2 = array2.length;
		for(int i= 0; i<Length1;i++) {
			for(int j=0;j<Length2;j++) {
				if(array1[i]==array2[j]) {
					System.out.println("The Interjection is "+ array1[i]);
				}
			}
		}
		
		
	}

}
