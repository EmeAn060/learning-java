import java.util.Scanner;

public class RepeatSong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while(isOnRepeat){
            System.out.println("Playing current song. \n Would you like to play the next song? If so, answer \"yes\" .");
            String useranswer = input.next();
            if (useranswer.equals("yes")){
                isOnRepeat = false;
                System.out.println("Playing next song.");
            }

        }
    }
}
