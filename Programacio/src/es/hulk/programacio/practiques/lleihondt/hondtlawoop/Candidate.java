package es.hulk.programacio.practiques.lleihondt.hondtlawoop;

public class Candidate extends Party {

    private int votes;
    private boolean isExclosed = false;
    private int seats;

    public Candidate(int votes, String name) {
        super(name);
        this.votes = votes;
        this.seats = seats;
    }

    public void setExclosed(boolean exclosed) {
        isExclosed = exclosed;
    }

    public boolean isExclosed() {
        return isExclosed;
    }

    public int getVotes() {
        return votes;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
