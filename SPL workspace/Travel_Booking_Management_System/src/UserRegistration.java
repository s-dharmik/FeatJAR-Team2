import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class UserRegistration {
    public Map<String, User> users;

    public UserRegistration() {
        this.users = new HashMap<>();
    }

    public void registerUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username:");
        String username = scanner.nextLine();

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        System.out.println("Enter email:");
        String email = scanner.nextLine();

        User user = new User(username, password, email);

        if (!users.containsKey(username)) {
            users.put(username, user);
            System.out.println("User registered successfully!");
        } else {
            System.out.println("Username already exists. Please try again.");
        }
    }

    public Map<String, User> getUsers() {
        return users;
    }

    public static class User {
        private String username;
        private String password;
        private String email;

        public User(String username, String password, String email) {
            this.username = username;
            this.password = password;
            this.email = email;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public String getEmail() {
            return email;
        }
    }
}
