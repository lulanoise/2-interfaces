package it.develhope.interfaces;
/**
 * A Professor class is a CollegePerson and implements a TeachingPerson interface
 */
public class Professor extends CollegePerson implements TeachingPerson{
    public String teachingSubject;

    /**
     * Constructor method for Professor object
     * @param name a String for the Professor name
     * @param surname a String for the Professor surname
     * @param collegeId an int identifier for the Professor
     * @param teachingSubject a String for the Professor subject
     */

    public Professor(String name, String surname, int collegeId, String teachingSubject) {
        super(name, surname, collegeId);
        this.teachingSubject = teachingSubject;

    }
    @Override
    public void teachToOtherPeople() {
        System.out.println("I am teaching " + teachingSubject);
    }

    @Override
    public void goToCollege() {
        super.goToCollege();
        System.out.println("Teaching subject: " + teachingSubject);
    }
        }