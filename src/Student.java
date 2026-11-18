
/**
 * Title: students grade 
 *
 * Description: this program with show a students first name last name and there grde 
 *
 * @author zeeshan ali
 */

public class Student {
    // instance variables
    private String studentId;
    private String firstName;
    private String lastName;
    private double[] grades;

    /** 
     * Name: default constructor
     * Description: the id, first and last names are initialized to "none"
     * the array is instantiated to store 4 elements - each element is
     * initialized to -1.0
     */
    public Student() {
        studentId = "none";
        firstName = "none";
        lastName = "none";

        grades = new double[4];

        for (int i = 0; i < grades.length; i++) {
            grades[i] = -1.0;
        }
    }

    /** 
     * Name: parameterized constructor
     * Description: stores the parameters into the appropriate instance variables
     * @param sId the value to be stored in the instance variable studentId
     * @param sFirstName the value to be stored in the instance variable firstName
     * @param sLastName the value to be stored in the instance variable lastName
     * @param sGrades the address of the array whose values will be copied into the 
     * instance variable grades
     */
    public Student(String sId, String sFirstName, String sLastName, double[] sGrades) {
        studentId = sId;
        firstName = sFirstName;
        lastName = sLastName;

        grades = new double[sGrades.length];

        for (int i = 0; i < grades.length; i++) {
            grades[i] = sGrades[i];
        }
    }

    /**
     * Name: setStudentId - mutator method for studentId
     * Description: stores the parameter into the instance variable
     * @param sId the value to be stored in the instance variable studentId
     */
    public void setStudentId(String sId) {
        studentId = sId;
    }

    /**
     * Name: setGrades - mutator method for grades
     * Description: stores the parameter into the instance variable
     * @param sGrades the address of the array whose values will be copied into the 
     * instance variable grades
     */
    public void setGrades(double[] sGrades) {
        for (int i = 0; i < grades.length; i++) {
            grades[i] = sGrades[i];
        }
    }

    /**
     * Name: getStudentId
     * Description: accessor method for id
     * @return a reference to the instance variable id
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * Name: getFirstName
     * Description: accessor method for firstName
     * @return a reference to the instance variable firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Name: getLastName
     * Description: accessor method for lastName
     * @return a reference to the instance variable lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Name: getGrades
     * Description: accessor method for grades
     * @return a reference to a copy of the instance variable grades
     */
    public double[] getGrades() {
        double[] copy = new double[grades.length];

        for (int i = 0; i < grades.length; i++) {
            copy[i] = grades[i];
        }

        return copy;
    }

    /**
     * Name: findLowestExam
     * Description: find the lowest exam score in the array and returns its location 
     * in the array
     * @return the position of the lowest exam grade in the array
     */
    public int findLowestExam() {
        int lowestPosition = 0;

        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < grades[lowestPosition]) {
                lowestPosition = i;
            }
        }

        return lowestPosition;
    }

    /**
     * Name: calcExamAverage
     * Description: calculates the average of the exams in one of two ways 
     * if the parameter is true, the lowest exam score is dropped in 
     * calculating the average
     * if the parameter is false, no exams are dropped in the calculating
     * the average
     * @param drop - a boolean variable to specify whether or not to drop the lowest score
     * @return the average of the exams
     */
    public double calcExamAverage(boolean drop) {
        double total = 0.0;
        int lowestPosition = -1;

        if (drop) {
            lowestPosition = this.findLowestExam();
        }

        for (int i = 0; i < grades.length; i++) {
            if (!drop || i != lowestPosition) {
                total += grades[i];
            }
        }

        if (drop) {
            return total / (grades.length - 1);
        } else {
            return total / grades.length;
        }
    }

    /**
     * Name: toString
     * Description: create and return a String with the instance variable values
     * @return a reference to a String containing the id, first and last names
     * and the exam grades
     */
    public String toString() {
        String result = "";

        result += "Id: " + studentId + "\n";
        result += "Name: " + lastName + ", " + firstName + "\n";
        result += "Grades: ";

        for (int i = 0; i < grades.length; i++) {
            result += grades[i] + " ";
        }

        return result;
    }
}
