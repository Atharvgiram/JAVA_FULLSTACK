package OopPractice;

public class Car extends Vehicle {

	@Override
	public void park(int slotNo, int hrs) {
		setSlotNo(slotNo);
		setHrs(hrs);
	}

	@Override
	void charges() {
		// TODO Auto-generated method stub
		int charges = getHrs() * 100;
		System.out.println("Car Parked......");
		System.out.println("NO of Hours...." + getHrs());
		System.out.println("Parking Charges...." + charges);
	}

}
