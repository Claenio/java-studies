import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Candidate> candidatesList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int candidatesCount = candidatesList.size();

        int voters;
        while(true){
            System.out.print("Set the amount of voters: ");
            voters = scan.nextInt();
            if(voters <= 2){
                System.out.println("Invalid! Set a value greater than 2.");
            } else {
                break;
            }
        }
        scan.nextLine();



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