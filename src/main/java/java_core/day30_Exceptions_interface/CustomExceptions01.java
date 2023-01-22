package java_core.day30_Exceptions_interface;

public class CustomExceptions01 {
    public static void main(String[] args) {

        getStudentGrade(120);
    }

    public static void getStudentGrade(int grade) {
        if (grade < 0 || grade > 100) {
            try {
                throw new InvalidStudentGradeException("Student's grades cannot be less than zero or greater than 100");
            } catch (InvalidStudentGradeException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(grade);
        }
    }

    public static void getTheNumberOfStudents(int numOfStudents) {

    }

}

