package OopPractice;

public class Customer extends User {

    @Override
    public void bookTicket(String movieName, int seats) {
        setMovieName(movieName);
        setSeats(seats);

        System.out.println("Online Ticket Booking");
        System.out.println("Movie: " + getMovieName());
        System.out.println("Seats: " + getSeats());
    }
}