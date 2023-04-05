
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for number of semesters completed
        System.out.print("How many semesters have you completed?: ");
        int numSemesters = scanner.nextInt();

        double[] semesterGPAs = new double[numSemesters];

        // Ask for GPA of each completed semester
        for (int i = 0; i < numSemesters; i++) {
            System.out.printf("Enter GPA for semester %d: ", i + 1);
            semesterGPAs[i] += scanner.nextDouble();
        }

        // Calculate CGPA
        double jerry=0;
        for (int i=0;i<semesterGPAs.length;i++){
            double semesterGPA = semesterGPAs[i];
            jerry +=semesterGPA;
        }
        double CGPA= jerry /numSemesters;
        System.out.println("Your CGPA is "+CGPA);


        // Calculate class of graduation
        String graduationClass;
        if ( CGPA>= 3.5) {
            graduationClass = "First Class";
            System.out.println(graduationClass);
        }
        else if (CGPA >= 3.0) {
            graduationClass = "Second Class Upper";
            System.out.println(graduationClass);
        }
        else if (CGPA >= 2.0) {
            graduationClass = "Second Class Lower";
            System.out.println(graduationClass);
        }
        else {
            graduationClass="pass";
        }
    }

}