package Mediator;

public class ChatUser extends User{
    public ChatUser(MediatorMessage mediatorMessage, String username) {
        super(mediatorMessage, username);
        mediatorMessage.addUser(this);
    }

    @Override
    public void send(String message) {
        System.out.println(this.username + "send: "+ message);
        mediatorMessage.sendMessage(message,this);
    }

    @Override
    public void receive(String message) {

    }
}
