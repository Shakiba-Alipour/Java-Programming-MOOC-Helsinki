 
import java.util.ArrayList;
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SHAKIBA
 */
public class MessagingService {
 
    private ArrayList<Message> list;
 
    public MessagingService() {
        this.list = new ArrayList<>();
    }
 
    public void add(Message message) {
        String m = message.getContent();
        if (m.length() <= 280) {
            this.list.add(message);
        }
    }
 
    public ArrayList<Message> getMessages() {
        return this.list;
    }
}
 
