package it.develhope.interfaces;

public class Test {

    public static void main(String[] args) {

        Student student = new Student("Harry", "Potter", 1181981, 6);
        Professor professor = new Professor("Albus", "Silente", 1883109, "Transfiguration");
        Assistant assistant = new Assistant("Percy", "Weasley", 2719761, true);

        System.out.println("--------first person going to college");
        student.goToCollege();
        student.studyAtHome();
        System.out.println("--------second person going to college");
        professor.goToCollege();
        professor.teachToOtherPeople();
        System.out.println("--------third person going to college");
        assistant.goToCollege();
        assistant.studyAtHome();
        assistant.teachToOtherPeople();
    }
}