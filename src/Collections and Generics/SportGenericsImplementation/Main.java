public class Main {
    public static void main(String[] args) {
        //ArrayList<Team> teams;
        //collection.sort()
        
        // create generics class to implements a league table for a sport.
        // the class should be allowed to be added on the list and store  a list of the teams in the league

        // your class should have a method to print out the team in order with the team at the top of the league printed first.

        // only team of the same type should be added to any particular  
        // instance of the league class - the  program should fail to compile 
        //  if any attempts is made to add an incompatible team.

        League <Team<FootballPlayer>> footballLeague = new League("SSM");
        Team <FootballPlayer> threeStar = new Team("Three Star");
        Team <FootballPlayer> policeClub = new Team("Police Club");
        Team <FootballPlayer> nepalArmy = new Team("Nepal Army");

        // nepalArmy.matchResult();

    }
    
}
