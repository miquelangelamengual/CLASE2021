package es.hulk.programacio.lab.les03;

import java.util.ArrayList;

/**
 * Created by Hulk
 * at 30/09/2021 8:20
 */

public class Team {

    private ArrayList<Player> playerList;
    private ArrayList<Integer> gamesPlayed;

    public Team(ArrayList<Player> playerList, ArrayList<Integer> gamesPlayed) {
        this.playerList = playerList;
        this.gamesPlayed = gamesPlayed;
    }

    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(ArrayList<Player> playerList) {
        this.playerList = playerList;
    }

    public ArrayList<Integer> getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(ArrayList<Integer> gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }
}
