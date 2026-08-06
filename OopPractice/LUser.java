package OopPractice;

public abstract class LUser implements IssueBook {

	private String bookName;
	private int days;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public abstract void calculateFine();
}