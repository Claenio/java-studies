import java.util.ArrayList;

public class Candidate{
    private String name;
    private int votes;

    public Candidate(String name){
        this.name = name;
        this.votes = 0;
    }

    public void addVotes(int votes){
        this.votes += votes;
    }
    public int getVotes(){
        return this.votes;
    }
    public String getName(){
        return this.name;
    }

    public static boolean vote(ArrayList<Candidate> list, String votedName) {
        for (int i = 0; i < list.size(); i++) {
            if (votedName.equalsIgnoreCase(list.get(i).getName())) {
                list.get(i).addVotes(1);
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Candidate> orderByVotes(ArrayList<Candidate> list){
        int listLength = list.size();

        for(int i = 0; i < listLength; i++){
            int maxNumberIndex = i;

            for(int j = i+1; j < listLength; j++){

                if(list.get(j).getVotes() > list.get(maxNumberIndex).getVotes()){
                    maxNumberIndex = j;
                }
            }
            Candidate temp = list.get(maxNumberIndex);
            list.set(maxNumberIndex, list.get(i));
            list.set(i, temp);
        }

        return list;
    }

    public static void printWinner(ArrayList<Candidate> list){

        if (list == null || list.size() == 0) {
            System.out.println("No candidates registered.");
            return;
        }

        Candidate winner = list.get(0);

        boolean tie = false;

        if (list.size() > 1) {
            if (list.get(1).getVotes() == winner.getVotes() && winner.getVotes() > 0) {
                tie = true;
            }
        }

        System.out.println("\n--- FINAL RESULT  ---");
        if (tie) {
            System.out.println("The election ended in a tie for first place!");
        } else {
            System.out.println("Winner: " + winner.getName());
        }
    }

    public static void printRanking(ArrayList<Candidate> list){

        int rank = 1;

        System.out.println("\n --- RANKING ---");
        for (int i = 0; i < list.size(); i++) {
            if (i > 0 && list.get(i).getVotes() < list.get(i - 1).getVotes()) {
                rank = i + 1;
            }
            System.out.println(rank + "° " + list.get(i).getName() + " - " + list.get(i).getVotes() + " votes");
        }
    }

}
