package Constructor;

public class Intrest {
	int principal, rate, time;

	public Intrest(int principal, int rate, int time) {
		this.principal = principal;
		this.rate = rate;
		this.time = time;

	}

	public void calSI() {
		float si = (principal * rate * time) / 100;
		System.out.println("Intresr : " + si);
	}
}
