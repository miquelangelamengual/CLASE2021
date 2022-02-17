package es.hulk.programacio.practiques.lleihondt.hondtlawoop;

public class Candidate extends Party {

    private int votes;
    private int seats;
    private static int toalVotes;

    public Candidate(String name, int votes, int seats) {
        super(name);
        this.votes = votes;
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public void addVotes(int votes) {
        this.votes += votes;
    }

    public void removeVotes(int votes) {
        this.votes -= votes;
    }

    //Coger todos los candidatos y sumar los votos
    public static void addTotalVotes(Candidate candidate){
        toalVotes += candidate.getVotes();
    }
}
