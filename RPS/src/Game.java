import java.util.Scanner;

public class Game {
    public static void play(){
        int AINum = AI.generateNum();
        int userNum = Player.selection();
        if (userNum == 1 && AINum == 1 || userNum == 2 && AINum == 2 || userNum == 3 && AINum == 3){
            System.out.println("It's a draw partner.");
        }
        else if (userNum == 2 && AINum == 1 || userNum == 1 && AINum == 3 || userNum == 3 && AINum == 2){
            System.out.println("You win!");
        }
        else {
            System.out.println("You lose!");
        }
    }
}
