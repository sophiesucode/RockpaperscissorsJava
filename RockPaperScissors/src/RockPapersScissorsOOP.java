import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class RockPapersScissorsOOP {
    private static final int WIN = -1;
    private static final int LOSS = 1;

    private static Choice getChoice(String input) {
        if (input.equals("ROCK")) {
            return new Rock();
        }
        if (input.equals("PAPER")) {
            return new Paper();
        }
        if (input.equals("SCISSORS")) {
            return new Scissors();
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// get player input
        Choice computerChoice = null;
        Choice playerChoice = null;
        int computerScore = 0;
        int playerScore = 0 ;
        System.out.println("Welcome to Rock Paper Scissors!");
        while(true) {
            System.out.println("Make a choice : Rock, paper, or scissors. > ");// then use scanner to get input

            playerChoice = getChoice(scanner.nextLine().toUpperCase());

            if (playerChoice == null) {
                System.out.println("That is an invalid choice");
                continue;
            }


            Choice[] arrOfChoices = new Choice[]{new Rock(), new Paper(), new Scissors()};
            computerChoice = arrOfChoices[new Random().nextInt(arrOfChoices.length)]; //get computer choice

            //comparing user choice and computerChoice
            //test for tie


            switch (playerChoice.compare(computerChoice)) {
                case WIN:
                    System.out.println("You won! The computer chose " + computerChoice + " and you chose " + playerChoice);
                    playerScore ++;
                    break;

                case LOSS:
                    System.out.println("The computer wins! The computer chose " + computerChoice + " but you chose " + playerChoice);
                    computerScore++;
                    break;
                default:
                    System.out.println("Neither of you win! It's a tie!");
                    break;
            }
            System.out.println("Score Player: " + playerScore + " Computer: " + computerScore);

            System.out.println("Would you like to play again?");
            String play = scanner.nextLine();
            if(play.toUpperCase(Locale.ROOT).charAt(0)!='Y'){
                break;
            }
        }
    }


}
