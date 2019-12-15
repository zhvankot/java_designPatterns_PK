/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mycompany.oop.observer.BinaryObserver;
import com.mycompany.oop.observer.HexadecimalObserver;
import com.mycompany.oop.observer.OctalObserver;
import com.mycompany.oop.observer.Subject;
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
        Subject subject = new Subject();
        
        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexadecimalObserver(subject);
        
        System.out.println("First state: ");
        subject.setState(117);
        
        System.out.println("Second state: ");
        subject.setState(226);
        
    }
    
}
