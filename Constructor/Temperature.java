package Constructor;

public class Temperature {
	float cel;

	public Temperature(float cel) {
		this.cel = cel;
	}

	public void conv() {
		float f = (cel * 9 / 5) + 32;
		System.out.println("Celcius to Farinate is : " + f);
	}
}
