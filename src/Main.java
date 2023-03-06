import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char playAgain = 'Y';

        while (playAgain == 'Y' || playAgain == 'y') {
            char playerAMove = getMove(scan, "Player A");
            char playerBMove = getMove(scan, "Player B");
            displayResult(playerAMove, playerBMove);

            System.out.print("Would you like to play again [Y/N]? ");
            playAgain = scan.next().charAt(0);


            char move = ' ';
            while (!(move == 'R' || move == 'P' || move == 'S' || move == 'r' || move == 'p' || move == 's')) {
                System.out.print(player + " make your move [R, P, S]: ");
                move = scan.next().charAt(0);
            }
            return Character.toUpperCase(move);


            private static void displayResult ( char playerAMove, char playerBMove){
                if (playerAMove == playerBMove) {
                    System.out.println(playerAMove + " vs " + playerBMove + " - it's a tie!");
                } else if (playerAMove.equalsIgnoreCase("R")) {
                    if (playerBMove.equalsIgnoreCase('S')) {
                        System.out.println("Rock breaks Scissors - Player A wins!");
                    } else {
                        System.out.println("Paper covers Rock - Player B wins!");
                    }
                } else if (playerAMove == 'P') {
                    if (playerBMove == 'R') {
                        System.out.println("Paper covers Rock - Player A wins!");
                    } else {
                        System.out.println("Scissors cuts Paper - Player B wins!");
                    }
                } else if (playerAMove == 'S') {
                    if (playerBMove == 'P') {
                        System.out.println("Scissors cuts Paper - Player A wins!");
                    } else {
                        System.out.println("Rock breaks Scissors - Player B wins!");
                    }
                }
            }
        }
    }
}