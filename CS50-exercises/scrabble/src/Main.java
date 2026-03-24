import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scrabble player1 = new Scrabble();
        Scrabble player2 = new Scrabble();

        System.out.print("Player 1: ");
        player1.setInput(scan.nextLine());
        System.out.print("Player 2: ");
        player2.setInput(scan.nextLine());
        String[] word = {player1.getInput(), player2.getInput()};
        int[] score = {player1.calculate(), player2.calculate()};

        if (score[0] > score[1]){
            System.out.println("\nPlayer 1 wins!");
        } else if (score[0] < score[1]){
            System.out.println("\nPlayer 2 wins!");
        } else {
            System.out.println("\nTie!");
        }

        System.out.printf("\nPlayer 1 word: %s | Points: %d!\nPlayer 2 word: %s | Points: %d!", word[0], score[0], word[1], score[1]);
        scan.close();

    }
}