package Main;

import java.util.ArrayList;

/**
 * Created by Pontus on 2014-08-24.
 */
public class Team {

    public String teamName;
    private int points = 0;
    private int wins = 0;
    private int losses = 0;
    private int ties = 0;
    private ArrayList<Result> matchHistory = new ArrayList();

    public Team(String team) {
        this.teamName = team;
    }
    public void addWin(){
        this.wins++;
        this.points += 3;
    }
    public void addTie(){
        this.ties++;
        this.points++;
    }
    public void addLosses(){
        this.losses++;
    }

    @Override
    public String toString() {
        return "Team " + teamName;
    }
}
