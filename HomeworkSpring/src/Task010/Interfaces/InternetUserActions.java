package Task010.Interfaces;

import Task010.Classes.Performance;

public interface InternetUserActions {
    void signUp();
    void signIn();
    void readPost();
    void buyTicketToPerformanceOnline(Performance performance);
}
