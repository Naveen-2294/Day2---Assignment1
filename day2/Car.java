package week1.day2;

public class Car {
	private static final boolean True = false;
	public static void main(String[] args) {
		Car obj = new Car();
		obj.printCarName();
		String mycarColor = obj.getMycarColor();
		System.out.println(mycarColor);
		int addThreeNumber = obj.addThreeNumber(2, 4, 6);
		System.out.println(addThreeNumber);
		int subTwoNumbers = obj.subTwoNumbers(3,2);
		System.out.println(subTwoNumbers);
		double mulTwoNumber = obj.mulTwoNumber(2.5, 4.3);
		System.out.println(mulTwoNumber);		
		
	}
	public void printCarName() {
	System.out.println("BMW");
	}
private int getRegNumber() {
	int RegNumber = 8888;
	return RegNumber;
}
  String getMycarColor() {
	String carColor = "Red";
	return carColor;
	}
public boolean carIsPuntured() {
	boolean carIsPuntured = True;
	return carIsPuntured;
	
}
public int addThreeNumber(int num1,int num2,int num3) {
	int sum = num1+num2+num3;
	return sum;
}
public int subTwoNumbers(int num1,int num2) {
	int sub = num1-num2;
	return sub;
}
private double mulTwoNumber(double num1,double num2) {
	double mul = num1*num2;
	return mul;
}
public int devTwoNumbers(int num1,int num2) {
	int dev = num1/num2;
	return dev;
}
}
