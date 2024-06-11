import java.util.Scanner;

// import EBookPackage.UserRegistration.User;
import java.util.Map;


public class UserLogin {
    private Map<String, UserRegistration.User> users;

    public UserLogin(Map<String, UserRegistration.User> users) {
        this.users = users;
    }

    public void loginUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username:");
        String username = scanner.nextLine();

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        UserRegistration.User user = users.get(username);

        if (user!= null && user.getPassword().equals(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
            System.exit(0);  // This line is added to exit the program if the login is invalid
        }
    }
}
