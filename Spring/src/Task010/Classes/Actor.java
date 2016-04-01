package Task010.Classes;

import Task010.Interfaces.ActorActions;

import java.util.ArrayList;

public class Actor extends Human implements ActorActions {
    int theNumberOfPerformances;
    ArrayList<Performance> bestPerformances;
    ArrayList<String> awards;

    public Actor() {
    }

    public Actor(String name, City city, String dateOfBirth, int theNumberOfPerformances,
                 ArrayList<Performance> bestPerformances, ArrayList<String> awards) {
        super(name, city, dateOfBirth);
        this.theNumberOfPerformances = theNumberOfPerformances;
        this.bestPerformances = bestPerformances;
        this.awards = awards;
    }

    public int getTheNumberOfPerformances() {
        return theNumberOfPerformances;
    }

    public ArrayList<Performance> getBestPerformances() {
        return bestPerformances;
    }

    public ArrayList<String> getAwards() {
        return awards;
    }

    @Override
    public void readTheScript() {
        System.out.println("John tells you..");
    }

    @Override
    public void play() {
        System.out.println("To be, or not to be: that is the question..");
    }

    @Override
    public void rehearse() {
        System.out.println("This option is better than the previous one?");
    }

    @Override
    public void signingAutographs() {
        System.out.println("Signing autographs.");
    }

    public void whoAmI() {
        System.out.println("I'm an actor.");
    }

    @Override
    public String toString() {
        return "My name is " + this.getName() + ". I'm an actor.";
    }
}
