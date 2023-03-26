package java_core.day37lambda;

public class Kurse_ {
    /* POJO;
            POJO: Plain Old Java Object
                1)Konstrukteur/Constructor OHNE Parameter
                2)Konstrukteur/Constructor mit alles Parameters
                3)getter() and setter()
                4)toString() // zum Schreiben ein Objekt
	    */


    private String Saison;
    private String kursName;
    private int durchschnittlichePunktzahl;
    private int nummervonStudent;

    //1)Constructor ohne Parameter
    public Kurse_() {
    }

    //2)Constructor mit allers Parameters
    public Kurse_(String season, String courseName, int durchschnittlichePunktzahl, int nummervonStudent) {
        Saison = season;
        this.kursName = courseName;
        this.durchschnittlichePunktzahl = durchschnittlichePunktzahl;
        this.nummervonStudent = nummervonStudent;
    }

    //3) getters() and setter()

    public String getSaison() {
        return Saison;
    }

    public void setSaison(String saison) {
        Saison = saison;
    }

    public String getKursName() {
        return kursName;
    }

    public void setKursName(String kursName) {
        this.kursName = kursName;
    }

    public int getDurchschnittlichePunktzahl() {
        return durchschnittlichePunktzahl;
    }

    public void setDurchschnittlichePunktzahl(int durchschnittlichePunktzahl) {
        this.durchschnittlichePunktzahl = durchschnittlichePunktzahl;
    }

    public int getNummervonStudent() {
        return nummervonStudent;
    }

    public void setNummervonStudent(int nummervonStudent) {
        this.nummervonStudent = nummervonStudent;
    }

    //4)toString()
    @Override
    public String toString() {
        return "Course: Season=" + Saison + ", courseName=" + kursName + ", " +
                "averageScore=" + durchschnittlichePunktzahl
                + ", numberOfStudents=" + nummervonStudent;
    }
}
