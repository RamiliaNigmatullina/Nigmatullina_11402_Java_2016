package Task007.Classes;

public class Comment {
    String text;
    InternetUser internetUser;
    String date;

    public Comment() {
    }

    public Comment(String text, InternetUser internetUser, String date) {
        this.text = text;
        this.internetUser = internetUser;
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public InternetUser getInternetUser() {
        return internetUser;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Comment: " + this.text + ".";
    }
}
