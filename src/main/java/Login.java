
import com.mycompany.chatapp.User;

public class Login {

    private User user;

    // Register user
    public void register(User user) {
        this.user = user;
    }

    // Check login details
    public boolean loginUser(String username, String password) {
        return user.username.equals(username) && user.password.equals(password);
    }

    // Return message
    public String returnLoginStatus(boolean status) {
        if (status) {
            return "Welcome " + user.firstName + ", " + user.lastName + " it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}

