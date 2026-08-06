package OopPractice;

public class Truck extends Vehicle {

	@Override
	public void park(int slotNo, int hrs) {
		setSlotNo(slotNo);
		setHrs(hrs);
	}

	@Override
	void charges() {
		// TODO Auto-generated method stub
		int charges = getHrs() * 200;
		System.out.println("Truck Parked......");
		System.out.println("NO of Hours...." + getHrs());
		System.out.println("Parking Charges...." + charges);
	}

}
