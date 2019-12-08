/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.flyweight;
import java.util.HashMap;
/**
 *
 * @author Admin
 */
public class PlayersFactory {
    private static final HashMap<String,Player> players = new HashMap<>();
    
    public static Player getPlayer(String team) {
        Player player = null;
        
        if(players.containsKey(team)){
            player = players.get(team);
        } else {
            switch(team) {
                case "Terrorist":
                    player = new Terrorist();
                    System.out.println("Terrorist team created!");
                    break;
                case "Counter-Terrorist":
                    player = new CounterTerrorist();
                    System.out.println("Counter-Terrorist team created!");
                    break;
                default:
                    System.out.println("Spectator detected!");
            }
            
         players.put(team, player);
        }
    
    return player;
    }
}
