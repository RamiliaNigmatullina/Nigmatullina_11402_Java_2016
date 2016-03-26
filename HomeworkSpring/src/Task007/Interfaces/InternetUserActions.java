package Task007.Interfaces;

import Task007.Classes.Performance;

public interface InternetUserActions {
    void signUp();
    void signIn();
    void readPost();
    void buyTicketToPerformanceOnline(Performance performance);
}
