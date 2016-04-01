package Task006.Interfaces;

import Task006.Classes.Performance;

public interface InternetUserActions {
    void signUp();
    void signIn();
    void readPost();
    void buyTicketToPerformanceOnline(Performance performance);
}
