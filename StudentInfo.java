import java.util.Scanner;
/** 
 * Script to practice User in- and output.
 * 
 * The name and age of the student are fixed. User can input grade of student.
 * 
 */
class StudentInfo {
    public static void main(String[] args) {

    int studentAge = 26;
    String studentFirstName = "Lisa";
    String studentLastName = "Mustermann";
    char studentFirstInitial = studentFirstName.charAt(0);
    char studentLastInitial = studentLastName.charAt(0);

    boolean hasPassed = true ;

    System.out.println(studentFirstName + " " + studentLastName + " is " + studentAge + " years old.");
    System.out.println("The initials are "+ studentFirstInitial + studentLastInitial +".");

    System.out.println("Type in the grade of the student:");
    Scanner input = new Scanner(System.in);
    double studentGrade = input.nextDouble();

    System.out.println(studentFirstName + " " + studentLastName + " has a grade of " +studentGrade + ".");

    }
}
