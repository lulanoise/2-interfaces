package it.develhope.interfaces;

/**
 * A Student class is a CollegePerson and implements a LearningPerson interface
 */

public class Student extends CollegePerson implements LearningPerson{

    public int academicYear;

    /**
     * Constructor method for Student
     * @param name a String for the Student name
     * @param surname a String for the Student surname
     * @param collegeId an int for the Student identifier
     * @param academicYear an int for the academic year
     */

    public Student(String name, String surname, int collegeId, int academicYear) {
        super(name, surname, collegeId);
        this.academicYear = academicYear;
    }
    // necessary override of the interface's abstract method
    @Override
    public void studyAtHome() {
        System.out.println("I am studying in the year " + academicYear);
    }
    @Override
    public void goToCollege() {
        super.goToCollege();
        System.out.println("Academic year: " + academicYear);
    }
}

