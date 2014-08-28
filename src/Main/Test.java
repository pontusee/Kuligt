package Main;

/**
 * Created by Pontus on 2014-08-24.
 */
public class Test {
    public static void main(String[] args){
        Serie testSer = new Serie("Nhl");
        //Team test = new Team("jesus");
        testSer.addTeam("jesus");
        testSer.addTeam("Gud");
        Team g1 = new Team("g1");
        if(testSer.serie.contains(g1)){
            System.out.print("Sanning");
        }
        System.out.print(testSer.serie);
    }
}
