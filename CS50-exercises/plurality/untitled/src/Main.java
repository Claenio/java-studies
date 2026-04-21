import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Candidates[] candidatesList = {new Candidates("Alice"), new Candidates("Bob"), new Candidates("Charlie")};
        Scanner scan = new Scanner(System.in);
        int candidatesCount = candidatesList.length;
        int candidatesMax = 9;
        int voters = 4;


        for(int i = 0; i < voters; i++){
            boolean isValid = false;

            while(!isValid){
                System.out.print("Vote: ");
                String voteName = scan.nextLine();

                isValid = Candidates.vote(candidatesList, voteName);

                if(!isValid){
                    System.out.print("Invalid vote! Set a valid ");
                }else {
                    System.out.println("Sucess vote!\n");
                }
            }

        }
        Candidates.orderByVotes(candidatesList);
        Candidates.printWinner(candidatesList);
        Candidates.printRanking(candidatesList);

    }
}