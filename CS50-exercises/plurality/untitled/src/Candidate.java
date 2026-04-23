public class Candidate {
    private String name;
    private int votes;

    public Candidate(String name) {
        this.name = name;
        this.votes = 0;
    }

    public void addVotes(int votes) {
        this.votes += votes;
    }

    public int getVotes() {
        return this.votes;
    }

    public String getName() {
        return this.name;
    }
}