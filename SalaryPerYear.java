import java.util.Scanner;

public class SalaryPerYear {
    

    public static float salaryCalculator(float salaryPerYear, int hoursPerWeek)
    {
        int weeksPerYear = 52;
        return weeksPerYear*hoursPerWeek*salaryPerYear;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How much money do you make per hour?");
        float salaryPerHour = input.nextFloat();
        System.out.println("How many hours do you work per week?");
        int hoursPerWeek = input.nextInt();

        // float salaryperyear = salaryPerYear(salaryPerHour,hoursPerWeek);

        System.out.println("Your salary per is "+ salaryCalculator(salaryPerHour,hoursPerWeek));
    }
    
}
