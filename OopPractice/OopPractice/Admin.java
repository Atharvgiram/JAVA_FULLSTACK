package OopPractice;

public class Admin extends User {

    @Override
    public void bookTicket(String movieName, int seats) {
        setMovieName(movieName);
        setSeats(seats);

        System.out.println("Offline Ticket Booking");
        System.out.println("Movie: " + getMovieName());
        System.out.println("Seats: " + getSeats());
    }
}