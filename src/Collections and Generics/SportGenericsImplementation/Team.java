import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    int played =0;
    int won=0;
    int lost =0;
    int tied = 0;
    
    private ArrayList<T> members = new ArrayList<>();

public Team(String name){
    this.name = name;
}
public String getName(){
    return name;
}
public boolean addPlayer(T player){
    if(members.contains(player)){
        System.out.println(player.getName()+ " is already on this team.");
        return false;
    }
    else{
        members.add(player);
        System.out.println(player.getName()+ " picked for the team.");
        return true;
    }

}
public int numPlayer(){
    return this.members.size();
}
public void matchResult(Team <T> opponent, int ourScores, int theirScores){
    String message;
    if(ourScores>theirScores){
        won++;
        message =" beats";
    }else if(ourScores == theirScores){
        tied++;
        message =" Tied";
    }else{
        lost++;
        message = " lost";
    }
    played++;
    if(opponent !=null){
        System.out.println(this.getName() + message + opponent.getName());
        opponent.matchResult(null,theirScores,ourScores);
    }
}
public int ranking(){
    return (won *2 )+ tied;
}

@Override
public int compareTo(Team<T> team){
    if(this.ranking()>team.ranking()){
        return -1;
    }
    else if(this.ranking()<team.ranking()){
        return 1;
    }else{
    return 0;
    }
}
}
