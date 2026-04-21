import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Candidate[] candidatesList = {new Candidate("Alice"), new Candidate("Bob"), new Candidate("Charlie")};
        Scanner scan = new Scanner(System.in);
        int candidatesCount = candidatesList.length;
        int candidatesMax = 9;
        int voters = 4;


        for(int i = 0; i < voters; i++){
            boolean isValid = false;

            while(!isValid){
                System.out.print("Vote: ");
                String voteName = scan.nextLine();

                isValid = Candidate.vote(candidatesList, voteName);

                if(!isValid){
                    System.out.print("Invalid vote! Set a valid ");
                }else {
                    System.out.println("Successful vote!\n");
                }
            }

        }
        Candidate.orderByVotes(candidatesList);
        Candidate.printWinner(candidatesList);
        Candidate.printRanking(candidatesList);

    }
}