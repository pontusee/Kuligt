package Main;

import java.util.ArrayList;

/**
 * Created by Pontus on 2014-08-24.
 */
public class Serie {

    private String serieName;
    public ArrayList<Team> serie = new ArrayList();             // Borde vara private

    public void addTeam(String team) {
        this.serie.add(new Team(team));
    }
    public void initSerie(){

    }
    public Team getTeam(String team){
        return new Team(team);
    }

    public Serie(String serieName) {
        this.serieName = serieName;
    }

    @Override
    public String toString() {
        return "Serie " +serie;
    }
}
