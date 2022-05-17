import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        startGame();
    }

    public static void startGame(){
        Game.play();
        endGame();
    }
    public static void endGame(){
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to play again? Yes or No ");
        String userInput = input.nextLine();
        while (!userInput.equalsIgnoreCase("yes") && !userInput.equalsIgnoreCase("no")){
            System.out.println("Please enter Yes or No ");
            userInput = input.nextLine();
        }
        if (userInput.equals("yes")){
            startGame();
        }else {
            System.exit(0);
        }
    }
}
