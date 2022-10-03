package week1.day2;

public class TwoWheeler1 {
	
	public static void main(String[] args) {
		TwoWheeler1 Bike = new TwoWheeler1();
		String bikeName = Bike.bikeName();
		System.out.println(bikeName);
		long chassisNumber = Bike.chassisNumber();
		System.out.println(chassisNumber);
		int noOfWheels = Bike.noOfWheels();
		System.out.println(noOfWheels);
		short noOfMirrors = Bike.noOfMirrors();
		System.out.println(noOfMirrors);
		boolean punctured = Bike.isPunctured();
		System.out.println(punctured);
		double runningKM = Bike.runningKM();
		System.out.println(runningKM);
		
	}
		public int noOfWheels() {
		int noOfWheels = 2;
		return noOfWheels;
		}
	public short noOfMirrors() {
		short noOfMirrors = 2;
		return noOfMirrors;
	}
	public long chassisNumber() {
		long chassisNumber = 789654378L;
		return chassisNumber;
	}
	public boolean isPunctured() {
		boolean isPunctured = true;
		return isPunctured;

	}
public String bikeName() {
	String bikeName = "Pulsar";
	return bikeName;
}
public double runningKM() {
	double runningKM = 35647.00;
	return runningKM;

}
	}



