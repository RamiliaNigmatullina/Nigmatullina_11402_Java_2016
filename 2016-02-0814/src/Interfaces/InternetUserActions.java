package Interfaces;

import Classes.Performance;

public interface InternetUserActions {
    void signUp();
    void signIn();
    void readPost();
    void buyTicketToPerformanceOnline(Performance performance);
}
