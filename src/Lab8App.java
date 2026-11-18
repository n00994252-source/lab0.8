/**
 * Title: Lab8App class
 *
 * Description: This project shows highest grade and lowest grade  
 *
 * @author zeeshan Ali
 */

public class Lab8App {

    public static void main(String[] args)
    {

        // Test the default constructor
        System.out.println("Testing default constructor:");
        Student student1 = new Student();
        System.out.println(student1.toString());
        System.out.println();

        // Test the parameterized constructor
        System.out.println("Testing parameterized constructor:");
        double[] examGrades = {98.5, 76.5, 79.0, 84.0};

        Student jane = new Student("123456789", "Jane", "Doe", examGrades);

        System.out.println(jane.toString());
        System.out.println();

        // Set Jane Doe's student ID
        System.out.println("Setting Jane Doe's id:");
        jane.setStudentId("987654321");
        System.out.println(jane.toString());
        System.out.println();

        // Set Jane Doe's second exam grade
        System.out.println("Setting Jane Doe's second exam:");
        double[] newGrades = jane.getGrades();
        newGrades[1] = 95.0;
        jane.setGrades(newGrades);
        System.out.println(jane.toString());
        System.out.println();

        // Get Jane Doe's student ID
        System.out.println("Getting the student id for Jane Doe:");
        System.out.println("Id is " + jane.getStudentId());
        System.out.println();

        // Get Jane Doe's first name
        System.out.println("Getting the first name for Jane Doe:");
        System.out.println("First name is " + jane.getFirstName());
        System.out.println();

        // Get Jane Doe's last name
        System.out.println("Getting the last name for Jane Doe:");
        System.out.println("Last name is " + jane.getLastName());
        System.out.println();

        // Get Jane Doe's grades
        System.out.println("Getting Jane Doe's grades:");
        double[] grades = jane.getGrades();

        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i] + " ");
        }

        System.out.println("\n");

        // Find the position of the lowest exam
        System.out.println("Getting the array position of the lowest exam:");
        System.out.println("Lowest exam is at position "
                + jane.findLowestExam());
        System.out.println();

        // Calculate the average without dropping the lowest exam
        System.out.println("Calculating the average without dropping the lowest exam:");
        System.out.println(jane.calcExamAverage(false));
        System.out.println();

        // Calculate the average after dropping the lowest exam
        System.out.println("Calculating the average after dropping the lowest exam:");
        System.out.println(jane.calcExamAverage(true));
    }
}
