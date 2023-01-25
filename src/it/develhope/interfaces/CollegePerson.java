package it.develhope.interfaces;
/**
 * Generic superclass that describes a person that goes daily to the college.
 */
public class CollegePerson {

    public String name;
    public String surname;
    public int collegeId;

    public CollegePerson(String name, String surname, int collegeId) { // metodo costruttore
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
    }

    /**
     * Simple method that prints the details of the person going to the college
     */
    public void goToCollege(){
        System.out.println("Name " + name);
        System.out.println("Surname " + surname);
        System.out.println("collegeId " + collegeId);
    }
}



