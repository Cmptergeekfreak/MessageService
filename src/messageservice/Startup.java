package messageservice;

import java.util.Random;

/**
 *
 * @author joe
 */
public class Startup {

    
    public static void main(String[] args) {
        
        MessageService ms = new MessageService(new KeyboardReader(), new GUIWriter());
        
        ms.processMessage();
        
    }
    
}
