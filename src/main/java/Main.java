/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import com.mycompany.oop.flyweight.PlayersFactory;
import com.mycompany.oop.flyweight.Player;
/**
 *
 * @author Admin
 */
public class Main {
    private static final String[] PLAYER ={"Terrorist","Counter-Terrorist"};
    private static final String[] WEAPON = {"K&M Sub-Machine Gun", "Clarion 5.56", "CV-47"};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (int i = 0; i < 10; i++ ) {
            Player player = PlayersFactory.getPlayer(getRandomPlayer());
            player.setWeapon(getRandomWeapon());
            player.showInformation();
        }
    }
    
    private static String getRandomPlayer() {
        Random random = new Random();
        int randomPlayer = random.nextInt(PLAYER.length);
        return PLAYER[randomPlayer];
    }
    
    private static String getRandomWeapon() {
       Random random = new Random();
       int randomWeapon = random.nextInt(WEAPON.length);
       return PLAYER[randomWeapon]; 
    }
    
}
