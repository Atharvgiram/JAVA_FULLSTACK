package OopPractice;

public class Bike extends Vehicle {

	@Override
	public void park(int slotNo, int hrs) {
		setSlotNo(slotNo);
		setHrs(hrs);
	}

	@Override
	void charges() {
		// TODO Auto-generated method stub
		int charges = getHrs() * 50;
		System.out.println("Bike Parked......");
		System.out.println("NO of Hours...." + getHrs());
		System.out.println("Parking Charges...." + charges);
	}

}
