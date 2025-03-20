package LAB_4;

import java.util.ArrayList;

public class Team {
    ArrayList<Player> arr = new ArrayList<>();

    public String team_name;
    public Team(){}
    public Team(String team){
        this.team_name = team;
    }
    public void addPlayer(Player name){
        arr.add(name);
    }
    public void updateName(String name){
        this.team_name = name;
    }

    public void printDetail(){
        System.out.println("Team: "+ team_name+"\nList of players: ");
        for(Player name : arr){
            System.out.println("Name: "+name.name+"\nAge: "+name.age+", Total Match: "+name.total_match);
        }
    }

}

