package es.hulk.programacio.lab.les03;

import java.util.ArrayList;

/**
 * Created by Hulk
 * at 30/09/2021 8:22
 */

public class League {

    private ArrayList<Team> teamList;

    public League(ArrayList<Team> teamList) {
        this.teamList = teamList;
    }

    public ArrayList<Team> getTeamList() {
        return teamList;
    }

    public void setTeamList(ArrayList<Team> teamList) {
        this.teamList = teamList;
    }
}