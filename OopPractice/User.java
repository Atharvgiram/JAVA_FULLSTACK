package OopPractice;

public abstract class User implements Booking {

    private String movieName;
    private int seats;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public abstract void bookTicket(String movieName, int seats);
}