import java.util.Scanner;

public class MultipleChoice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String question = "How is the weather today? \na: Cloudy \nb: Sunny \nc: Rainy \nAnswer with a,b or c.";
        System.out.println(question);
        boolean answerAgain = true;
        String correctAnswer = "b";
        while(answerAgain){
            String userinput = input.next();
            if (correctAnswer.equals(userinput.toLowerCase())){
                answerAgain = false;
                System.out.println("Congratulations, your answer is correct!");
            }
            else {
                System.out.println("This is not the correct answer. Please try again.");
            }
        }


    }
}
