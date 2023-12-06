/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soccer;

/**
 *
 * @author Jada
 */
public class League {
    public static void main(String[] args) {
        //instantiating objects
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        
        //adding player info
        player1.playerName = "George Eliot";
        player2.playerName = "Graham Greene";
        player3.playerName = "Geoffrey Chaucer";
        
        //creating array of players(links to team object)
        Player[] thePlayers = {player1, player2, player3};
        
        //player1.playerName = "Robert Service";
        
        //instantiate a team
        Team team1 = new Team();
        
        team1.teamName = "The Greens";
        team1.playerArray = thePlayers;
        
        //team1
        System.out.println(team1.teamName + " Players: ");
        for(Player thePlayer: team1.playerArray) {
            System.out.println(thePlayer.playerName);
        }
        
        
    }
}
