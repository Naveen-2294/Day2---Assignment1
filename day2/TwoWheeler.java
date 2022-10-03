package week1.day2;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 345678976L;
	boolean isPunctured = true;
	String bikeName = "Pulsar";
	double runningKM = 8675.00;
	public static void main(String[] args) {
		TwoWheeler Bike = new TwoWheeler();
		
		System.out.println(Bike.noOfWheels);
		System.out.println(Bike.noOfMirrors);
		System.out.println(Bike.chassisNumber);
		System.out.println(Bike.isPunctured);
		System.out.println(Bike.bikeName);
		System.out.println(Bike.runningKM);
		
	}
	
	

}
