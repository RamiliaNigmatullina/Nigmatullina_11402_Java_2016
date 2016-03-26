package Task007.Classes;

import Task007.Interfaces.ActionsWithComments;
import Task007.Interfaces.InternetUserActions;

public class InternetUser extends Human implements ActionsWithComments, InternetUserActions {
    String username;
    String email;
    String password;

    public InternetUser() {
    }

    public InternetUser(String name, City city, String dateOfBirth, String username, String email, String password) {
        super(name, city, dateOfBirth);
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void whoAmI() {
        System.out.println("I'm an Internet user.");
    }

    @Override
    public void leaveComment(Comment comment) {
        System.out.println("Classes.Comment added.");
    }

    @Override
    public void deleteComment(Comment comment) {
        System.out.println("Classes.Comment deleted.");
    }

    @Override
    public void editComment(Comment comment) {
        System.out.println("Classes.Comment changed.");
    }

    @Override
    public void replyToComment(Comment comment) {
        System.out.println("The answer has been sent.");
    }

    @Override
    public void signUp() {
        System.out.println("You've registered successfully.");
    }

    @Override
    public void signIn() {
        System.out.println("You're logged in.");
    }

    @Override
    public void readPost() {
        System.out.println("I'm reading the post.");
    }

    @Override
    public void buyTicketToPerformanceOnline(Performance performance) {
        System.out.println("Classes.Ticket purchased.");
    }

    @Override
    public String toString() {
        return "My name is " + this.getName() + ". I'm a Internet user.";
    }
}
