package Methods;

public class Login {

    boolean login(String username, String password) {

        if (username == "admin" && password == "1234")
            return true;
        else
            return false;
    }
}