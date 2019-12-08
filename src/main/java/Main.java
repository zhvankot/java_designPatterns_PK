/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mycompany.oop.proxy.Page;
import com.mycompany.oop.proxy.ProxyPage;

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
        
        Page google = new ProxyPage("google.com");
        Page twitter = new ProxyPage("twitter.com");
        
        google.displayPage();
        twitter.displayPage();
        
    }
    
}
