package it.develhope.interfaces;
/**
 * The Assistant is a CollegePerson that can teach and learn
 */
public class Assistant extends CollegePerson implements LearningPerson, TeachingPerson{

    boolean isGoingToBeAPhD;
    /**
     * Assistant method constructor
     * @param name a String for the Assistant name
     * @param surname a String for the Assistant surname
     * @param collegeId an int identifier for the Assistant
     * @param isGoingToBeAPhD a boolean for the Assistant possible PhD
     */

    public Assistant(String name, String surname, int collegeId, boolean isGoingToBeAPhD) {
        super(name, surname, collegeId);
        this.isGoingToBeAPhD = isGoingToBeAPhD;
    }
    @Override
    public void teachToOtherPeople() {
        System.out.println("I am an assistant and I am teaching");

    }
    @Override
    public void studyAtHome() {
        System.out.println("I am an assistant and I am learning");
    }

    @Override
    public void goToCollege(){
        System.out.println("The Assistant is going to be a PhD: " + isGoingToBeAPhD);
    }
}