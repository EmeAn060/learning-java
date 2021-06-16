import java.util.Scanner;

public class FortuneTeller {

    public static void main(String[] args) {
        System.out.println("Please type in a number between 1 and 10:");
        Scanner input = new Scanner(System.in);
        int inputnumber = input.nextInt();
        if (inputnumber < 5){
            System.out.println("Enjoy the good luck a friend brings you.");
        } else {
            System.out.println("Your shoe selection will make you very happy today.");
    }  
    }


    
}
