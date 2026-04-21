public class Candidates{
    private String name;
    private int votes;

    public Candidates(String name){
        this.name = name;
        this.votes = 0;
    }

    public void setVotes(int votes){
        this.votes += votes;
    }
    public int getVotes(){
        return this.votes;
    }
    public String getName(){
        return this.name;
    }

    public static boolean vote(Candidates[] list, String votedName) {
        for (int i = 0; i < list.length; i++) {
            if (votedName.equalsIgnoreCase(list[i].getName())) {
                list[i].setVotes(1);
                return true;
            }
        }
        return false;
    }

    public static Candidates[] orderByVotes(Candidates[] list){
        int listLength = list.length;

        for(int i = 0; i < listLength; i++){
            int maxNumberIndex = i;

            for(int j = i+1; j < listLength; j++){

                if(list[j].getVotes() > list[maxNumberIndex].getVotes()){
                    maxNumberIndex = j;
                }
            }
            Candidates temp = list[maxNumberIndex];
            list[maxNumberIndex] = list[i];
            list[i] = temp;
        }

        return list;
    }

    public static void printWinner(Candidates[] list){

        if (list == null || list.length == 0) {
            System.out.println("No candidates registered.");
        }

        Candidates winner = list[0];

        boolean tie = false;

        if (list.length > 1) {
            if (list[1].getVotes() == winner.getVotes() && winner.getVotes() > 0) {
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

    public static void printRanking(Candidates[] list){

        int rank = 1;

        System.out.println("\n --- RANKING ---");
        for (int i = 0; i < list.length; i++) {
            if (i > 0 && list[i].getVotes() < list[i - 1].getVotes()) {
                rank = i + 1;
            }
            System.out.println(rank + "° " + list[i].getName() + " - " + list[i].getVotes() + " votes");
        }
    }

}
