package OopPractice;

public abstract class Vehicle implements Parking {
	private int slotNo;
	private int hrs;

	public int getSlotNo() {
		return slotNo;
	}

	public void setSlotNo(int slotNo) {
		this.slotNo = slotNo;
	}

	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) {
		this.hrs = hrs;
	}

	abstract void charges();

}
