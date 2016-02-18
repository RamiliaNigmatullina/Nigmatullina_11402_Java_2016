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

    public void setText(String text) {
        this.text = text;
    }

    public InternetUser getInternetUser() {
        return internetUser;
    }

    public void setInternetUser(InternetUser internetUser) {
        this.internetUser = internetUser;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
