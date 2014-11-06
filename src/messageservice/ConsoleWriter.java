package messageservice;

/**
 *
 * @author joe
 */
public class ConsoleWriter implements MessageWriter {

    @Override
    public void writeMessage(String message) {
        System.out.println(message);
    }
    
}
