import java.util.Scanner;

public class Player {

    public static int selection(){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose Rock, Paper, or Scissors. ");
        String userInput = input.nextLine();
        while (!userInput.equalsIgnoreCase("rock") && !userInput.equalsIgnoreCase("paper") && !userInput.equalsIgnoreCase("scissors")){
            System.out.println("Please Type Only Rock, Paper, or Scissors. ");
            userInput = input.nextLine();
        }
        int num = 0;
        if (userInput.equalsIgnoreCase("rock")){
            num = 1;
        }
        else if (userInput.equalsIgnoreCase("paper")){
            num = 2;
        }
        else {
            num = 3;
        }
        return num;
    }
}
