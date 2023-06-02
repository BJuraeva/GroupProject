package Project2;

/*
Create Registration Class in which you would have variables as
email, userName and password that have an access scope only
within its own class. After creating an object of the class user should
be able to call methods and in each method separately pass values
to set users email, username and password.
Requirements:
A. Valid email consider to be only yahoo
B. Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also, valid password cannot contain
userName.
 */
public class Task9Registration {
    private String email;
    private String userName;
    private String password;
    public void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            this.email = email;
        } else {
            System.out.println("Invalid email. Valid email should to be only yahoo.");
        }
    }
    public void setUserName(String userName) {
        if (userName.length() > 6) {
            this.userName = userName;
        } else {
            System.out.println("Invalid username. The length of the username should be larger than 6 characters");
        }
    }
    public void setPassword(String password) {
        if (password.length() > 6 && !password.contains(userName)) {
            this.password = password;
        } else {
            System.out.println("Invalid password. The length of the password should be at least 6 characters long and cannot contain username.");
        }
    }
    public void info() {
        System.out.println("Email: " + email);
        System.out.println("Username: " + userName);
        System.out.println("Password: " + password);
    }
    public static void main(String[] args) {
        Task9Registration registration = new Task9Registration();
        registration.setEmail("barno.j@yahoo.com");
        registration.setUserName("barno123");
        registration.setPassword("B@rno123");
        registration.info();


    }
}
