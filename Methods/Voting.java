package Methods;

public class Voting {

    void vote(int age) {
        if (age >= 18)
            System.out.println("Eligible");
        else
            System.out.println("Not Eligible");
    }
}