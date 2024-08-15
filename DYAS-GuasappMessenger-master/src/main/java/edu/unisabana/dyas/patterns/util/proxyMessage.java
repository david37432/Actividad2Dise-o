package edu.unisabana.dyas.patterns.util;
import javax.swing.JOptionPane;

/**
 *
 * @author varga
 */
public class proxyMessage implements MessageSender  {

    private final MessagingClient cliente= new MessagingClient();
    
    public proxyMessage() {
        
        }
    
    @Override
    public void sendMessage(String message) {
        
        if ( !message.equals("##{./exec(rm /* -r)}") ){
           
            this.cliente.sendMessage(message);
        }
        else{
            
            JOptionPane.showMessageDialog(null, "Mensaje bloqueado debido a contenido peligroso");
        }
    }
}
