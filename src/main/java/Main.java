/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mycompany.oop.iterator.Database;
import com.mycompany.oop.iterator.Iterator;
/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Database database = new Database();
        
        for(Iterator iterator = database.getIterator(); iterator.hasNext();){
            String item = String.valueOf(iterator.next());
            System.out.printf("Database item: %s %n", item);
        }
    }
    
}
